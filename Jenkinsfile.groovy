pipeline {
    agent any  
    stages {  
        stage("Hello") {
            steps {
                // 步骤内构建脚本               
				echo "Hello World!"
				${build_commnd}
					}
				}
    post {
        always {  
            echo "Say goodbye!"
        }
    }
}