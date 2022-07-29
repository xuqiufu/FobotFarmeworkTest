pipeline {

    agent any  

    stages {  
        stage("build") {
            steps {
                // 步骤内构建脚本  
				
				echo "Say goodbye!"
				bat '''@echo off
				
				%build_commnd%
				//pybot keyword_driven.robot
				'''
				//${build_commnd}
				}
		post {
			always { 
				script{
				echo "Say goodbye!"
				}
				}
			}
		}
	}	
}