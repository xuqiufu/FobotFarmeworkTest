pipeline {

    agent any  

    stages {  
        stage("build") {
            steps {
                // 步骤内构建脚本  
				
				echo "start build testcase!"
				echo "finish build testcase!"
			}
		}
	}	
}
