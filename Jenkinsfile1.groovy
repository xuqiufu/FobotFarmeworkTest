pipeline {

    agent any  

    stages {  
        stage("build") {
            steps {
		  script{
		    sh"""
		    ${build_commnd}
		    """	  	    		  				
		    echo " ${build_commnd}"
		  }
			}
		}
	}	
}
