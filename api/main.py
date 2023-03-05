from typing import List, Union

import uplink
from fastapi import Depends, FastAPI
from fastapi.encoders import jsonable_encoder
from fastapi.security import APIKeyHeader, OAuth2PasswordBearer
from fastapi.responses import JSONResponse
from module.client.UChatGPTService import UChatGPTService

from module.model.error.errorResponse import ErrorResponse
from module.model.model.modelResponse import ModelResponse
import uvicorn

app = FastAPI()
oauth2_scheme = OAuth2PasswordBearer(tokenUrl="token")

@app.get("/api/models", response_model=Union[ErrorResponse, ModelResponse])
async def getModels(token: str = Depends(oauth2_scheme)):
    service = UChatGPTService(token=token);
    json_compatible_item_data = jsonable_encoder(service.getModels())
    return JSONResponse(content=json_compatible_item_data)

if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)
