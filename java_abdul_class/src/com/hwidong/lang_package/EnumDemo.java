package com.hwidong.lang_package;


// enum을 정의하면 자동적으로 enum이라는 class를 상속함
enum Dept {
	// enum에서 정의한 identifier는 public final static임
	// identifier 그 자체가 value이기 때문에 따로 value를 assign하지 않아도 됨
//	CS, IT, CIVIL, ECE;
	
	
	// enum은 constructor를 가질 수 있음
	// enum의 constructor는 private 또는 default여야함 
//	private Dept() {
//		System.err.println(this.name());
//		//-> CS, IT, CVIL, ECE모두 출력됨(for문처럼)
//		// enum이 loaded될 때마다 identifiers들이 생성됨
//	}
	

	// identifier에 value 줄수도 있음
	CS("John", "Block A"), IT("Smith", "Block B"), CIVIL("Dave", "Block C"), ECE("Hwidong", "Block D");	
	
	String headName;
	String location;
	
	// 만약 identifier에 value를 주는 경우 constructor에 파라미터로 받아야 함
	private Dept(String headName, String location) {
		this.headName = headName;
		this.location = location;
	}
	
	public String getHeadName() {
		return headName;
	}

	public String getLocation() {
		return location;
	}
	
	// method가질 수 있음. 얘는 public도 가능
	public void display() {
		System.out.println(this.name() + " " + this.ordinal());
	}
}

public class EnumDemo {
	
	public static void main(String[] args) {
		Dept d = Dept.CIVIL;
		System.out.println(d);
		
		System.out.println(d.ordinal());
		System.out.println(d.name());
		
		// ### enum에는 정의된 순서대로 index같은 값을 갖고 있음
		System.out.println(d.name());
		
		// ### EnumClass.valueOf(값)으로 Enum identifier가져올 수 있음
		System.out.println(Dept.valueOf("IT"));
		
		// ###  만약 enum에 없는 경우 IllegalArgumentException 발생
		try {			
			System.out.println(Dept.valueOf("RANDOMWORKD"));
		} catch(IllegalArgumentException err) {
			System.out.println(err);
		}
		
		// ### EnumClass.values()로 enum리스트 가져올 수도 있음
		Dept list[] = Dept.values();
		for (Dept deptInList : list) {
			System.out.println(deptInList);
		}
		
		
		// ### switch문에서 사용할 수 있음
		//-> enum의 유용한 usecase
		switch(d) {
			case CS:
				System.out.println("Switch문에서 CS department으로 옴");
				break;
			case IT:
				System.out.println("Switch문에서 IT department으로 옴");
				break;
			case CIVIL:
				System.out.println("Switch문에서 CIVIL department으로 옴");
				break;
			case ECE:
				System.out.println("Switch문에서 ECE department으로 옴");
				break;
		}
		
		
		// enum에서 정의한 커스텀 메서드 사용
		System.out.println("==================== enum에서 정의한 커스텀 메서드 ====================");
		d.display();
		
		
		System.out.println("==================== 값 준후 ====================");
		System.out.println(d.getHeadName());
		System.out.println(d.getLocation());
	}
}
