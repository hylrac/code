package io.robusta.domain;

/**
 * Created by Nicolas
 * Date: 15/02/14
 * Time: 21:26
 */
public class Admin extends User {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String statement;

    public Admin() {
		this.admin = true;
	}
    
    
    public Admin(Long id, String name, String statement) {
		super(id, name);
		this.admin = true;
		this.name = name;
		this.statement = statement;
	}

	

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
    
    public void speak(){
    	System.out.println(this.statement);
    }
    
    
    public void speak(String text){
    	System.out.println(this.name+" says :'"+text+"'");    	
    }
    
    public void fire(User u){
    	System.out.println(u + " is out");
    }
    
    public void fire(Admin u){
    	System.out.println("Hmmm... well, nothing");
    }
}
