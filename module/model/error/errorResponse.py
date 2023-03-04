from typing import List

from pydantic import BaseModel

from module.model.error.detail import Detail


class ErrorResponse(BaseModel):
    detail: Detail
