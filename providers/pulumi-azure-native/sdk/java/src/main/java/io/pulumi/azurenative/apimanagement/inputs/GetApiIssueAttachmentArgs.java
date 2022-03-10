// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetApiIssueAttachmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiIssueAttachmentArgs Empty = new GetApiIssueAttachmentArgs();

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="apiId", required=true)
      private final String apiId;

    public String getApiId() {
        return this.apiId;
    }

    /**
     * Attachment identifier within an Issue. Must be unique in the current Issue.
     * 
     */
    @InputImport(name="attachmentId", required=true)
      private final String attachmentId;

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * Issue identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="issueId", required=true)
      private final String issueId;

    public String getIssueId() {
        return this.issueId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetApiIssueAttachmentArgs(
        String apiId,
        String attachmentId,
        String issueId,
        String resourceGroupName,
        String serviceName) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.attachmentId = Objects.requireNonNull(attachmentId, "expected parameter 'attachmentId' to be non-null");
        this.issueId = Objects.requireNonNull(issueId, "expected parameter 'issueId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetApiIssueAttachmentArgs() {
        this.apiId = null;
        this.attachmentId = null;
        this.issueId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiIssueAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private String attachmentId;
        private String issueId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiIssueAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.attachmentId = defaults.attachmentId;
    	      this.issueId = defaults.issueId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder apiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder attachmentId(String attachmentId) {
            this.attachmentId = Objects.requireNonNull(attachmentId);
            return this;
        }

        public Builder issueId(String issueId) {
            this.issueId = Objects.requireNonNull(issueId);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetApiIssueAttachmentArgs build() {
            return new GetApiIssueAttachmentArgs(apiId, attachmentId, issueId, resourceGroupName, serviceName);
        }
    }
}
