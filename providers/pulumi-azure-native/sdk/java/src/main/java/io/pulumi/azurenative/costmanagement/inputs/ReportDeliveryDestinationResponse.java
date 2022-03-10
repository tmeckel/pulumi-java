// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The destination information for the delivery of the report.
 * 
 */
public final class ReportDeliveryDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportDeliveryDestinationResponse Empty = new ReportDeliveryDestinationResponse();

    /**
     * The name of the container where reports will be uploaded.
     * 
     */
    @InputImport(name="container", required=true)
      private final String container;

    public String getContainer() {
        return this.container;
    }

    /**
     * The resource id of the storage account where reports will be delivered.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * The name of the directory where reports will be uploaded.
     * 
     */
    @InputImport(name="rootFolderPath")
      private final @Nullable String rootFolderPath;

    public Optional<String> getRootFolderPath() {
        return this.rootFolderPath == null ? Optional.empty() : Optional.ofNullable(this.rootFolderPath);
    }

    public ReportDeliveryDestinationResponse(
        String container,
        String resourceId,
        @Nullable String rootFolderPath) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.rootFolderPath = rootFolderPath;
    }

    private ReportDeliveryDestinationResponse() {
        this.container = null;
        this.resourceId = null;
        this.rootFolderPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private String resourceId;
        private @Nullable String rootFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.resourceId = defaults.resourceId;
    	      this.rootFolderPath = defaults.rootFolderPath;
        }

        public Builder container(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder rootFolderPath(@Nullable String rootFolderPath) {
            this.rootFolderPath = rootFolderPath;
            return this;
        }
        public ReportDeliveryDestinationResponse build() {
            return new ReportDeliveryDestinationResponse(container, resourceId, rootFolderPath);
        }
    }
}
