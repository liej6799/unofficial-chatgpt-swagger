from typing import List, Union

import uplink
from fastapi import Depends, FastAPI
from fastapi.encoders import jsonable_encoder
from fastapi.security import APIKeyHeader
from fastapi.responses import JSONResponse
from module.client.UChatGPTService import UChatGPTService

from module.model.error.errorResponse import ErrorResponse
from module.model.model.modelResponse import ModelResponse

app = FastAPI()
oauth2_scheme = APIKeyHeader(name="token")


@app.get("/api/models", response_model=Union[ErrorResponse, ModelResponse])
async def getModels(token: str = Depends(oauth2_scheme)):
    service = UChatGPTService(token=token);
    json_compatible_item_data = jsonable_encoder(service.getModels())
    return JSONResponse(content=json_compatible_item_data)

