package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentoDto {
	
	private Long id;
	private LocalDateTime uploadDate;
	private String contextKey;
	private String uploadRequestId;
	private String fileName;
	private String webHook;
	private Boolean ocrSent;
	private Boolean requestTimeOut;
	private LocalDateTime requestTimeOutDateTime;
	private String ocrRequestId;
	private LocalDateTime ocrReceivedDateTime;
	private Integer ocrReceivedInternalError;
	private String ocrReceivedMessage;
	private Boolean ocrProcessResponse;
	private LocalDateTime ocrProcessResponseDateTime;
	private Boolean ocrProcessResponseError;
	private String ocrProcessResponseErrorReason;
	private String ocrProcessResponseDataType;
	private String ocrProcessResponseClass;
	private Double ocrProcessResponsePredictionProb;
	private Boolean appError;
	private String appErrorReason;
	private String ocrFileUrl;
	private String ocrImageUrl;
	private String ocrTextUrl;
	private String ocrThumbUrl;
	private String ocrReceivedValue;
	private Boolean appHandledError;
	private String allReasons;
	
}
