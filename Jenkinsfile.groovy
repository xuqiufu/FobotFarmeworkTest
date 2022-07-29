pipeline {
    agent any  
    stages {  
        stage("Hello") {
            steps {
                // 步骤内构建脚本               
				${build_commnd}
					}
				}
    post {
        always {  
            echo "Say goodbye!"
			}
		}
	}
}