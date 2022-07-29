pipeline {

    agent any  
	environment{
		commnd="${params.build_commnd}"
		}
    stages {  
        stage("build") {
            steps {
                // 步骤内构建脚本  
				
				echo "Say goodbye!"
				bat '''@echo off
				pybot keyword_driven.robot
				'''
				//${build_commnd}
				}
		//post {
			//always { 
				//script{
				//echo "Say goodbye!"
				//}
				//}
			//}
		}
	}	
}