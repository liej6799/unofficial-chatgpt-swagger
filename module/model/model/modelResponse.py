from typing import List, Optional

from pydantic import BaseModel, Extra

from module.model.model.model import Model

class ModelResponse(BaseModel):
    models: Optional[List[Model]]
