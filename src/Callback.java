interface Callback {
	void performCallback();
}

class Client1 implements Callback {
	public void performCallback() {		
	System.out.println("Client 1");
	}
}

class Client2 implements Callback {
	public void performCallback(){
		System.out.println("Client 2");
	}	
}

class Caller {
	public void register(Callback callback){
		callback.performCallback();
	}

public static void main(String[] args) {
		Caller caller = new Caller();
		Callback client1 = new Client1();
		Callback client2 = new Client2();
		caller.register(client1); 
		caller.register(client2); 
	}
}