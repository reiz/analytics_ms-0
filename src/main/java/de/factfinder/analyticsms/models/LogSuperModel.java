package de.factfinder.analyticsms.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lp_logs")
public class LogSuperModel {

	@Id
	public String id;

	public String version;
	public String timestamp;
	public String message;

}
