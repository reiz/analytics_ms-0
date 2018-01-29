package de.factfinder.analyticsms.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lp_logs")
public class Log extends LogSuperModel {

	public Log() {
	}

	@Override
	public String toString() {
		return String.format("Log[id=%s, message='%s']", id, message);
	}

}
