package test.mypac;

public class YourRemocon implements Remocon{
	@Override
	public void up() {
		System.out.println("너 리모콘 업");
	}
	@Override
	public void down() {
		System.out.println("너 리모콘 다운");
	}
}

