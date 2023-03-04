from __future__ import annotations

from typing import Any

from pydantic import BaseModel

class Detail(BaseModel):
    message: str
    type: str
    param: Any
    code: str
