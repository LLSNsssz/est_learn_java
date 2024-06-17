RedBlackTree 클래스는 레드-블랙 트리를 구현한 것입니다. Node 내부 클래스는 트리의 노드를 나타냅니다. 각 노드는 데이터(data), 왼쪽 자식(left), 오른쪽
자식(right), 부모 노드(parent), 그리고 색상(color)을 가집니다.
insert 메서드는 레드-블랙 트리에 새로운 노드를 삽입하는 연산입니다.

트리가 비어있는 경우, 새로운 노드를 루트로 설정하고 색상을 블랙으로 변경합니다.
삽입할 위치를 찾기 위해 트리를 탐색합니다. 삽입할 값과 현재 노드의 값을 비교하여 왼쪽 또는 오른쪽 서브트리로 이동합니다.
삽입 위치를 찾으면 새로운 노드를 해당 위치에 삽입하고, 부모 노드와 연결합니다.
삽입 후에는 fixInsert 메서드를 호출하여 레드-블랙 트리의 속성을 복원합니다.

fixInsert 메서드는 삽입 후에 레드-블랙 트리의 속성을 복원하는 역할을 합니다.

삽입된 노드가 루트 노드이거나 부모 노드가 블랙인 경우, 속성 복원이 필요하지 않습니다.
삽입된 노드의 부모 노드가 레드인 경우, 삼촌 노드(부모의 형제 노드)의 색상에 따라 세 가지 경우로 나누어 처리합니다.

Case 1: 부모와 삼촌 노드가 모두 레드인 경우, 부모와 삼촌 노드를 블랙으로 변경하고 조부모 노드를 레드로 변경합니다. 그리고 조부모 노드를 새로운 노드로 설정하여 계속 속성
복원을 진행합니다.
Case 2: 노드가 부모의 오른쪽 자식이고, 부모가 조부모의 왼쪽 자식인 경우(또는 그 반대), 현재 노드에서 왼쪽(또는 오른쪽) 회전을 수행하여 Case 3로 만듭니다.
Case 3: 노드가 부모의 왼쪽 자식이고, 부모가 조부모의 왼쪽 자식인 경우(또는 그 반대), 부모 노드를 블랙으로 변경하고 조부모 노드를 레드로 변경한 후, 조부모 노드에서
오른쪽(또는 왼쪽) 회전을 수행합니다.

최종적으로 루트 노드의 색상을 항상 블랙으로 유지합니다.

rotateLeft와 rotateRight 메서드는 각각 왼쪽 회전과 오른쪽 회전을 수행하는 연산입니다.

회전은 트리의 균형을 유지하기 위해 사용되며, 노드의 위치를 조정하고 부모-자식 관계를 업데이트합니다.
왼쪽 회전은 오른쪽 자식을 부모로 만들고, 오른쪽 자식의 왼쪽 서브트리를 현재 노드의 오른쪽 서브트리로 만듭니다.
오른쪽 회전은 왼쪽 자식을 부모로 만들고, 왼쪽 자식의 오른쪽 서브트리를 현재 노드의 왼쪽 서브트리로 만듭니다.

위 코드는 레드-블랙 트리의 삽입 연산을 구현한 것으로, 삽입 후에 트리의 균형을 유지하고 레드-블랙 트리의 속성을 복원하는 과정을 보여줍니다. 이를 통해 검색, 삽입, 삭제
연산의 시간 복잡도를 O(log n)으로 보장할 수 있습니다.
삭제 연산의 경우에는 좀 더 복잡한 과정이 필요하며, 삭제할 노드의 위치와 색상에 따라 다양한 경우를 처리해야 합니다. 하지만 기본적인 아이디어는 삽입 연산과 유사하게 트리의
균형을 유지하고 레드-블랙 트리의 속성을 복원하는 것입니다.
레드-블랙 트리는 이진 검색 트리의 일종으로, 균형을 유지하면서 효율적인 검색, 삽입, 삭제 연산을 제공하는 자료구조입니다. 실제로 많은 언어의 표준 라이브러리에서 레드-블랙
트리를 기반으로 구현된 트리 자료구조를 제공하고 있습니다.