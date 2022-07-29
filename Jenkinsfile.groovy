pipeline {

    agent any  
    stages {  
        stage("build") {
            steps {
                // 步骤内构建脚本  
				
				script{
				echo "Say goodbye!"
				echo $build_commnd				}
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