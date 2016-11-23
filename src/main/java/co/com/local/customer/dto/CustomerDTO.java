package co.com.local.customer.dto;

public class CustomerDTO {
	
	private long id;
	private String documentType;
	private String documentNumber;
    private String name;
    
	public CustomerDTO(long id, String documentType, String documentNumber, String name) {
		super();
		this.id = id;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	public String getDocumentType() {
		return documentType;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public String getName() {
		return name;
	}

}
