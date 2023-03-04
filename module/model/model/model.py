from typing import List

from pydantic import BaseModel

class Model(BaseModel):
    slug: str
    max_tokens: int
    title: str
    description: str
    tags: List