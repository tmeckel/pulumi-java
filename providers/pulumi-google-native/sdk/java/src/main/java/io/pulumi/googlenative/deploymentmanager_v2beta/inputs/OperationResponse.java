// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.OperationErrorResponse;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.OperationWarningsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents an Operation resource. Google Compute Engine has three Operation resources: * [Global](/compute/docs/reference/rest/{$api_version}/globalOperations) * [Regional](/compute/docs/reference/rest/{$api_version}/regionOperations) * [Zonal](/compute/docs/reference/rest/{$api_version}/zoneOperations) You can use an operation resource to manage asynchronous API requests. For more information, read Handling API responses. Operations can be global, regional or zonal. - For global operations, use the `globalOperations` resource. - For regional operations, use the `regionOperations` resource. - For zonal operations, use the `zonalOperations` resource. For more information, read Global, Regional, and Zonal Resources.
 * 
 */
public final class OperationResponse extends io.pulumi.resources.InvokeArgs {

    public static final OperationResponse Empty = new OperationResponse();

    /**
     * The value of `requestId` if you provided it in the request. Not present otherwise.
     * 
     */
    @InputImport(name="clientOperationId", required=true)
    private final String clientOperationId;

    public String getClientOperationId() {
        return this.clientOperationId;
    }

    /**
     * A textual description of the operation, which is set when the operation is created.
     * 
     */
    @InputImport(name="description", required=true)
    private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The time that this operation was completed. This value is in RFC3339 text format.
     * 
     */
    @InputImport(name="endTime", required=true)
    private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * If errors are generated during processing of the operation, this field will be populated.
     * 
     */
    @InputImport(name="error", required=true)
    private final OperationErrorResponse error;

    public OperationErrorResponse getError() {
        return this.error;
    }

    /**
     * If the operation fails, this field contains the HTTP error message that was returned, such as `NOT FOUND`.
     * 
     */
    @InputImport(name="httpErrorMessage", required=true)
    private final String httpErrorMessage;

    public String getHttpErrorMessage() {
        return this.httpErrorMessage;
    }

    /**
     * If the operation fails, this field contains the HTTP error status code that was returned. For example, a `404` means the resource was not found.
     * 
     */
    @InputImport(name="httpErrorStatusCode", required=true)
    private final Integer httpErrorStatusCode;

    public Integer getHttpErrorStatusCode() {
        return this.httpErrorStatusCode;
    }

    /**
     * The time that this operation was requested. This value is in RFC3339 text format.
     * 
     */
    @InputImport(name="insertTime", required=true)
    private final String insertTime;

    public String getInsertTime() {
        return this.insertTime;
    }

    /**
     * Type of the resource. Always `compute#operation` for Operation resources.
     * 
     */
    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Name of the operation.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * An ID that represents a group of operations, such as when a group of operations results from a `bulkInsert` API request.
     * 
     */
    @InputImport(name="operationGroupId", required=true)
    private final String operationGroupId;

    public String getOperationGroupId() {
        return this.operationGroupId;
    }

    /**
     * The type of operation, such as `insert`, `update`, or `delete`, and so on.
     * 
     */
    @InputImport(name="operationType", required=true)
    private final String operationType;

    public String getOperationType() {
        return this.operationType;
    }

    /**
     * An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of operations. This should not be used to guess when the operation will be complete. This number should monotonically increase as the operation progresses.
     * 
     */
    @InputImport(name="progress", required=true)
    private final Integer progress;

    public Integer getProgress() {
        return this.progress;
    }

    /**
     * The URL of the region where the operation resides. Only applicable when performing regional operations.
     * 
     */
    @InputImport(name="region", required=true)
    private final String region;

    public String getRegion() {
        return this.region;
    }

    /**
     * Server-defined URL for the resource.
     * 
     */
    @InputImport(name="selfLink", required=true)
    private final String selfLink;

    public String getSelfLink() {
        return this.selfLink;
    }

    /**
     * The time that this operation was started by the server. This value is in RFC3339 text format.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The status of the operation, which can be one of the following: `PENDING`, `RUNNING`, or `DONE`.
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * An optional textual description of the current status of the operation.
     * 
     */
    @InputImport(name="statusMessage", required=true)
    private final String statusMessage;

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * The unique target ID, which identifies a specific incarnation of the target resource.
     * 
     */
    @InputImport(name="targetId", required=true)
    private final String targetId;

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk that the snapshot was created from.
     * 
     */
    @InputImport(name="targetLink", required=true)
    private final String targetLink;

    public String getTargetLink() {
        return this.targetLink;
    }

    /**
     * User who requested the operation, for example: `user@example.com`.
     * 
     */
    @InputImport(name="user", required=true)
    private final String user;

    public String getUser() {
        return this.user;
    }

    /**
     * If warning messages are generated during processing of the operation, this field will be populated.
     * 
     */
    @InputImport(name="warnings", required=true)
    private final List<OperationWarningsItemResponse> warnings;

    public List<OperationWarningsItemResponse> getWarnings() {
        return this.warnings;
    }

    /**
     * The URL of the zone where the operation resides. Only applicable when performing per-zone operations.
     * 
     */
    @InputImport(name="zone", required=true)
    private final String zone;

    public String getZone() {
        return this.zone;
    }

    public OperationResponse(
        String clientOperationId,
        String description,
        String endTime,
        OperationErrorResponse error,
        String httpErrorMessage,
        Integer httpErrorStatusCode,
        String insertTime,
        String kind,
        String name,
        String operationGroupId,
        String operationType,
        Integer progress,
        String region,
        String selfLink,
        String startTime,
        String status,
        String statusMessage,
        String targetId,
        String targetLink,
        String user,
        List<OperationWarningsItemResponse> warnings,
        String zone) {
        this.clientOperationId = Objects.requireNonNull(clientOperationId, "expected parameter 'clientOperationId' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.httpErrorMessage = Objects.requireNonNull(httpErrorMessage, "expected parameter 'httpErrorMessage' to be non-null");
        this.httpErrorStatusCode = Objects.requireNonNull(httpErrorStatusCode, "expected parameter 'httpErrorStatusCode' to be non-null");
        this.insertTime = Objects.requireNonNull(insertTime, "expected parameter 'insertTime' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operationGroupId = Objects.requireNonNull(operationGroupId, "expected parameter 'operationGroupId' to be non-null");
        this.operationType = Objects.requireNonNull(operationType, "expected parameter 'operationType' to be non-null");
        this.progress = Objects.requireNonNull(progress, "expected parameter 'progress' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.selfLink = Objects.requireNonNull(selfLink, "expected parameter 'selfLink' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.statusMessage = Objects.requireNonNull(statusMessage, "expected parameter 'statusMessage' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
        this.targetLink = Objects.requireNonNull(targetLink, "expected parameter 'targetLink' to be non-null");
        this.user = Objects.requireNonNull(user, "expected parameter 'user' to be non-null");
        this.warnings = Objects.requireNonNull(warnings, "expected parameter 'warnings' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private OperationResponse() {
        this.clientOperationId = null;
        this.description = null;
        this.endTime = null;
        this.error = null;
        this.httpErrorMessage = null;
        this.httpErrorStatusCode = null;
        this.insertTime = null;
        this.kind = null;
        this.name = null;
        this.operationGroupId = null;
        this.operationType = null;
        this.progress = null;
        this.region = null;
        this.selfLink = null;
        this.startTime = null;
        this.status = null;
        this.statusMessage = null;
        this.targetId = null;
        this.targetLink = null;
        this.user = null;
        this.warnings = List.of();
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientOperationId;
        private String description;
        private String endTime;
        private OperationErrorResponse error;
        private String httpErrorMessage;
        private Integer httpErrorStatusCode;
        private String insertTime;
        private String kind;
        private String name;
        private String operationGroupId;
        private String operationType;
        private Integer progress;
        private String region;
        private String selfLink;
        private String startTime;
        private String status;
        private String statusMessage;
        private String targetId;
        private String targetLink;
        private String user;
        private List<OperationWarningsItemResponse> warnings;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.httpErrorMessage = defaults.httpErrorMessage;
    	      this.httpErrorStatusCode = defaults.httpErrorStatusCode;
    	      this.insertTime = defaults.insertTime;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.operationGroupId = defaults.operationGroupId;
    	      this.operationType = defaults.operationType;
    	      this.progress = defaults.progress;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.targetId = defaults.targetId;
    	      this.targetLink = defaults.targetLink;
    	      this.user = defaults.user;
    	      this.warnings = defaults.warnings;
    	      this.zone = defaults.zone;
        }

        public Builder setClientOperationId(String clientOperationId) {
            this.clientOperationId = Objects.requireNonNull(clientOperationId);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setError(OperationErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setHttpErrorMessage(String httpErrorMessage) {
            this.httpErrorMessage = Objects.requireNonNull(httpErrorMessage);
            return this;
        }

        public Builder setHttpErrorStatusCode(Integer httpErrorStatusCode) {
            this.httpErrorStatusCode = Objects.requireNonNull(httpErrorStatusCode);
            return this;
        }

        public Builder setInsertTime(String insertTime) {
            this.insertTime = Objects.requireNonNull(insertTime);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperationGroupId(String operationGroupId) {
            this.operationGroupId = Objects.requireNonNull(operationGroupId);
            return this;
        }

        public Builder setOperationType(String operationType) {
            this.operationType = Objects.requireNonNull(operationType);
            return this;
        }

        public Builder setProgress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder setTargetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }

        public Builder setTargetLink(String targetLink) {
            this.targetLink = Objects.requireNonNull(targetLink);
            return this;
        }

        public Builder setUser(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }

        public Builder setWarnings(List<OperationWarningsItemResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public OperationResponse build() {
            return new OperationResponse(clientOperationId, description, endTime, error, httpErrorMessage, httpErrorStatusCode, insertTime, kind, name, operationGroupId, operationType, progress, region, selfLink, startTime, status, statusMessage, targetId, targetLink, user, warnings, zone);
        }
    }
}
