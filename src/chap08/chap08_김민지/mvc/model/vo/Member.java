package chap08.chap08_김민지.mvc.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String citizenNo;
	private double height;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String memberId, String memberPwd, String memberName, String citizenNo, double heigth) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.citizenNo = citizenNo;
		this.height = heigth;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getCitizenNo() {
		return citizenNo;
	}

	public void setCitizenNo(String citizenNo) {
		this.citizenNo = citizenNo;
	}

	public double getHeigth() {
		return height;
	}

	public void setHeigth(double heigth) {
		this.height = heigth;
	}
	
	public String infomation() {
		return "memberId : " + memberId + ", memberPwd : " + memberPwd + ", memberName : " + memberName + ", citizenNo : " + citizenNo + ", height : " + height;
		
	}

}
