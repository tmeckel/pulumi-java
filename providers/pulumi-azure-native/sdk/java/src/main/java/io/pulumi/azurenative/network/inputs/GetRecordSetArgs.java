// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRecordSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRecordSetArgs Empty = new GetRecordSetArgs();

    /**
     * The type of DNS record in this record set.
     * 
     */
    @InputImport(name="recordType", required=true)
      private final String recordType;

    public String getRecordType() {
        return this.recordType;
    }

    /**
     * The name of the record set, relative to the name of the zone.
     * 
     */
    @InputImport(name="relativeRecordSetName", required=true)
      private final String relativeRecordSetName;

    public String getRelativeRecordSetName() {
        return this.relativeRecordSetName;
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
     * The name of the DNS zone (without a terminating dot).
     * 
     */
    @InputImport(name="zoneName", required=true)
      private final String zoneName;

    public String getZoneName() {
        return this.zoneName;
    }

    public GetRecordSetArgs(
        String recordType,
        String relativeRecordSetName,
        String resourceGroupName,
        String zoneName) {
        this.recordType = Objects.requireNonNull(recordType, "expected parameter 'recordType' to be non-null");
        this.relativeRecordSetName = Objects.requireNonNull(relativeRecordSetName, "expected parameter 'relativeRecordSetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.zoneName = Objects.requireNonNull(zoneName, "expected parameter 'zoneName' to be non-null");
    }

    private GetRecordSetArgs() {
        this.recordType = null;
        this.relativeRecordSetName = null;
        this.resourceGroupName = null;
        this.zoneName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecordSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recordType;
        private String relativeRecordSetName;
        private String resourceGroupName;
        private String zoneName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecordSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordType = defaults.recordType;
    	      this.relativeRecordSetName = defaults.relativeRecordSetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.zoneName = defaults.zoneName;
        }

        public Builder recordType(String recordType) {
            this.recordType = Objects.requireNonNull(recordType);
            return this;
        }

        public Builder relativeRecordSetName(String relativeRecordSetName) {
            this.relativeRecordSetName = Objects.requireNonNull(relativeRecordSetName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder zoneName(String zoneName) {
            this.zoneName = Objects.requireNonNull(zoneName);
            return this;
        }
        public GetRecordSetArgs build() {
            return new GetRecordSetArgs(recordType, relativeRecordSetName, resourceGroupName, zoneName);
        }
    }
}
