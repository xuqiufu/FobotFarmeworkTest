pipeline {

    agent any  
	environment{
		commnd="${params.build_commnd}"
		}
    stages {  
        stage("build") {
            steps {
                // 步骤内构建脚本  
				
				script{
				echo "Say goodbye!"
				echo ${env.commnd}
				//${build_commnd}
				
			
					}
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