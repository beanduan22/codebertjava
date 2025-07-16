# Prompt:
from typing import List, Tuple


def rolling_max(numbers: List[int]) -> List[int]:
    """ From a given list of integers, generate a list of rolling maximum element found until given moment
    in the sequence.
    >>> rolling_max([1, 2, 3, 2, 3, 4, 2])
    [1, 2, 3, 3, 3, 4, 4]
    """

# Solution:
from typing import List, Tuple


def rolling_max(numbers: List[int]) -> List[int]:
    """ From a given list of integers, generate a list of rolling maximum element found until given moment
    in the sequence.
    >>> rolling_max([1, 2, 3, 2, 3, 4, 2])
    [1, 2, 3, 3, 3, 4, 4]
    """
/docs/task_manager.md
# Task manager

The main goal of this task is to implement a task management application.

Each user should be able to create a list of tasks. Each task should contain:
- Task name
- Task description
- Due date
- Task status (open, in progress, done)

Application should provide:
- Create a new task
- List all user's tasks
- Update a task
    - Update task status
    - Update task due date
    - Update task name
    - Update task description
- Remove a task

### Implementation

