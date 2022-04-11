// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.UebaDataSources;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UebaArgs extends io.pulumi.resources.ResourceArgs {

    public static final UebaArgs Empty = new UebaArgs();

    /**
     * The relevant data sources that enriched by ueba
     * 
     */
    @Import(name="dataSources")
      private final @Nullable Output<List<Either<String,UebaDataSources>>> dataSources;

    public Output<List<Either<String,UebaDataSources>>> getDataSources() {
        return this.dataSources == null ? Codegen.empty() : this.dataSources;
    }

    /**
     * The kind of the setting
     * Expected value is 'Ueba'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
      private final Output<String> operationalInsightsResourceProvider;

    public Output<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
     * 
     */
    @Import(name="settingsName")
      private final @Nullable Output<String> settingsName;

    public Output<String> getSettingsName() {
        return this.settingsName == null ? Codegen.empty() : this.settingsName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public UebaArgs(
        @Nullable Output<List<Either<String,UebaDataSources>>> dataSources,
        Output<String> kind,
        Output<String> operationalInsightsResourceProvider,
        Output<String> resourceGroupName,
        @Nullable Output<String> settingsName,
        Output<String> workspaceName) {
        this.dataSources = dataSources;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.settingsName = settingsName;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private UebaArgs() {
        this.dataSources = Codegen.empty();
        this.kind = Codegen.empty();
        this.operationalInsightsResourceProvider = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.settingsName = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UebaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<String,UebaDataSources>>> dataSources;
        private Output<String> kind;
        private Output<String> operationalInsightsResourceProvider;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> settingsName;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(UebaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSources = defaults.dataSources;
    	      this.kind = defaults.kind;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.settingsName = defaults.settingsName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder dataSources(@Nullable Output<List<Either<String,UebaDataSources>>> dataSources) {
            this.dataSources = dataSources;
            return this;
        }
        public Builder dataSources(@Nullable List<Either<String,UebaDataSources>> dataSources) {
            this.dataSources = Codegen.ofNullable(dataSources);
            return this;
        }
        public Builder dataSources(Either<String,UebaDataSources>... dataSources) {
            return dataSources(List.of(dataSources));
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }
        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Output.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder settingsName(@Nullable Output<String> settingsName) {
            this.settingsName = settingsName;
            return this;
        }
        public Builder settingsName(@Nullable String settingsName) {
            this.settingsName = Codegen.ofNullable(settingsName);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public UebaArgs build() {
            return new UebaArgs(dataSources, kind, operationalInsightsResourceProvider, resourceGroupName, settingsName, workspaceName);
        }
    }
}
