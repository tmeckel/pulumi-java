// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs extends io.pulumi.resources.ResourceArgs {

    public static final StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs Empty = new StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs();

    @InputImport(name="environmentName", required=true)
    private final Input<String> environmentName;

    public Input<String> getEnvironmentName() {
        return this.environmentName;
    }

    @InputImport(name="functionAppName")
    private final @Nullable Input<String> functionAppName;

    public Input<String> getFunctionAppName() {
        return this.functionAppName == null ? Input.empty() : this.functionAppName;
    }

    @InputImport(name="functionAppRegion")
    private final @Nullable Input<String> functionAppRegion;

    public Input<String> getFunctionAppRegion() {
        return this.functionAppRegion == null ? Input.empty() : this.functionAppRegion;
    }

    @InputImport(name="functionAppResourceId")
    private final @Nullable Input<String> functionAppResourceId;

    public Input<String> getFunctionAppResourceId() {
        return this.functionAppResourceId == null ? Input.empty() : this.functionAppResourceId;
    }

    @InputImport(name="isForced")
    private final @Nullable Input<Boolean> isForced;

    public Input<Boolean> getIsForced() {
        return this.isForced == null ? Input.empty() : this.isForced;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs(
        Input<String> environmentName,
        @Nullable Input<String> functionAppName,
        @Nullable Input<String> functionAppRegion,
        @Nullable Input<String> functionAppResourceId,
        @Nullable Input<Boolean> isForced,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName) {
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.functionAppName = functionAppName;
        this.functionAppRegion = functionAppRegion;
        this.functionAppResourceId = functionAppResourceId;
        this.isForced = isForced;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs() {
        this.environmentName = Input.empty();
        this.functionAppName = Input.empty();
        this.functionAppRegion = Input.empty();
        this.functionAppResourceId = Input.empty();
        this.isForced = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> environmentName;
        private @Nullable Input<String> functionAppName;
        private @Nullable Input<String> functionAppRegion;
        private @Nullable Input<String> functionAppResourceId;
        private @Nullable Input<Boolean> isForced;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.functionAppName = defaults.functionAppName;
    	      this.functionAppRegion = defaults.functionAppRegion;
    	      this.functionAppResourceId = defaults.functionAppResourceId;
    	      this.isForced = defaults.isForced;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEnvironmentName(Input<String> environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder setEnvironmentName(String environmentName) {
            this.environmentName = Input.of(Objects.requireNonNull(environmentName));
            return this;
        }

        public Builder setFunctionAppName(@Nullable Input<String> functionAppName) {
            this.functionAppName = functionAppName;
            return this;
        }

        public Builder setFunctionAppName(@Nullable String functionAppName) {
            this.functionAppName = Input.ofNullable(functionAppName);
            return this;
        }

        public Builder setFunctionAppRegion(@Nullable Input<String> functionAppRegion) {
            this.functionAppRegion = functionAppRegion;
            return this;
        }

        public Builder setFunctionAppRegion(@Nullable String functionAppRegion) {
            this.functionAppRegion = Input.ofNullable(functionAppRegion);
            return this;
        }

        public Builder setFunctionAppResourceId(@Nullable Input<String> functionAppResourceId) {
            this.functionAppResourceId = functionAppResourceId;
            return this;
        }

        public Builder setFunctionAppResourceId(@Nullable String functionAppResourceId) {
            this.functionAppResourceId = Input.ofNullable(functionAppResourceId);
            return this;
        }

        public Builder setIsForced(@Nullable Input<Boolean> isForced) {
            this.isForced = isForced;
            return this;
        }

        public Builder setIsForced(@Nullable Boolean isForced) {
            this.isForced = Input.ofNullable(isForced);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs build() {
            return new StaticSiteUserProvidedFunctionAppForStaticSiteBuildArgs(environmentName, functionAppName, functionAppRegion, functionAppResourceId, isForced, kind, name, resourceGroupName);
        }
    }
}
