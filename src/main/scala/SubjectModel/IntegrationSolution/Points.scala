package SubjectModel.IntegrationSolution

class Points extends IntegrationSolutions {

  override val description: String = "При данном подходе интегрированные системы взаимодействуют напрямую. Преимущества подхода — простота, прозрачность и отсутствие необходимости в дополнительном программном обеспечении. Однако, есть и недостатки. Во-первых, интегрированные приложения должны общаться с использованием одинаковых методов взаимодействия и форматов вызовов/данных. При изменении одного из приложений (если оно повлекло за собой изменение интерфейса взаимодействия данного приложения) приходится модифицировать или как минимум перенастраивать все интегрированные с ним системы. Во-вторых, в информационной системе предприятия появляется слишком много связей, каждую из которых нужно контролировать и поддерживать в работоспособном состоянии."

  override val integrationSolutions: String = "Точка-точка"


}