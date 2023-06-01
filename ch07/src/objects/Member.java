package objects;

public class Member {
	String id;
	
	public Member(String id) {
		this.id=id;
	}

	@Override
	public int hashCode() {
		
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.id == member.id) {
				return true;
			}
		}
		return false;
	}
	
	

}
