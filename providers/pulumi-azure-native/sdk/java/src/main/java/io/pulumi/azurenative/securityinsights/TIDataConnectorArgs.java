// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.inputs.TIDataConnectorDataTypesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TIDataConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TIDataConnectorArgs Empty = new TIDataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @InputImport(name="dataConnectorId")
      private final @Nullable Input<String> dataConnectorId;

    public Input<String> getDataConnectorId() {
        return this.dataConnectorId == null ? Input.empty() : this.dataConnectorId;
    }

    /**
     * The available data types for the connector.
     * 
     */
    @InputImport(name="dataTypes")
      private final @Nullable Input<TIDataConnectorDataTypesArgs> dataTypes;

    public Input<TIDataConnectorDataTypesArgs> getDataTypes() {
        return this.dataTypes == null ? Input.empty() : this.dataTypes;
    }

    /**
     * The kind of the data connector
     * Expected value is 'ThreatIntelligence'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tenant id to connect to, and get the data from.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    /**
     * The lookback period for the feed to be imported.
     * 
     */
    @InputImport(name="tipLookbackPeriod")
      private final @Nullable Input<String> tipLookbackPeriod;

    public Input<String> getTipLookbackPeriod() {
        return this.tipLookbackPeriod == null ? Input.empty() : this.tipLookbackPeriod;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public TIDataConnectorArgs(
        @Nullable Input<String> dataConnectorId,
        @Nullable Input<TIDataConnectorDataTypesArgs> dataTypes,
        Input<String> kind,
        Input<String> resourceGroupName,
        @Nullable Input<String> tenantId,
        @Nullable Input<String> tipLookbackPeriod,
        Input<String> workspaceName) {
        this.dataConnectorId = dataConnectorId;
        this.dataTypes = dataTypes;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tenantId = tenantId;
        this.tipLookbackPeriod = tipLookbackPeriod;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private TIDataConnectorArgs() {
        this.dataConnectorId = Input.empty();
        this.dataTypes = Input.empty();
        this.kind = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tenantId = Input.empty();
        this.tipLookbackPeriod = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TIDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataConnectorId;
        private @Nullable Input<TIDataConnectorDataTypesArgs> dataTypes;
        private Input<String> kind;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<String> tipLookbackPeriod;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(TIDataConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataConnectorId = defaults.dataConnectorId;
    	      this.dataTypes = defaults.dataTypes;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tenantId = defaults.tenantId;
    	      this.tipLookbackPeriod = defaults.tipLookbackPeriod;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder dataConnectorId(@Nullable Input<String> dataConnectorId) {
            this.dataConnectorId = dataConnectorId;
            return this;
        }

        public Builder dataConnectorId(@Nullable String dataConnectorId) {
            this.dataConnectorId = Input.ofNullable(dataConnectorId);
            return this;
        }

        public Builder dataTypes(@Nullable Input<TIDataConnectorDataTypesArgs> dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        public Builder dataTypes(@Nullable TIDataConnectorDataTypesArgs dataTypes) {
            this.dataTypes = Input.ofNullable(dataTypes);
            return this;
        }

        public Builder kind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder tipLookbackPeriod(@Nullable Input<String> tipLookbackPeriod) {
            this.tipLookbackPeriod = tipLookbackPeriod;
            return this;
        }

        public Builder tipLookbackPeriod(@Nullable String tipLookbackPeriod) {
            this.tipLookbackPeriod = Input.ofNullable(tipLookbackPeriod);
            return this;
        }

        public Builder workspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public TIDataConnectorArgs build() {
            return new TIDataConnectorArgs(dataConnectorId, dataTypes, kind, resourceGroupName, tenantId, tipLookbackPeriod, workspaceName);
        }
    }
}
