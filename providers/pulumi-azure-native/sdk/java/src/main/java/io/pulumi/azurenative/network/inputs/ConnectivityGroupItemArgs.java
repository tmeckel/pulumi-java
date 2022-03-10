// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.GroupConnectivity;
import io.pulumi.azurenative.network.enums.IsGlobal;
import io.pulumi.azurenative.network.enums.UseHubGateway;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectivityGroupItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectivityGroupItemArgs Empty = new ConnectivityGroupItemArgs();

    /**
     * Group connectivity type.
     * 
     */
    @InputImport(name="groupConnectivity")
      private final @Nullable Input<Either<String,GroupConnectivity>> groupConnectivity;

    public Input<Either<String,GroupConnectivity>> getGroupConnectivity() {
        return this.groupConnectivity == null ? Input.empty() : this.groupConnectivity;
    }

    /**
     * Flag if global is supported.
     * 
     */
    @InputImport(name="isGlobal")
      private final @Nullable Input<Either<String,IsGlobal>> isGlobal;

    public Input<Either<String,IsGlobal>> getIsGlobal() {
        return this.isGlobal == null ? Input.empty() : this.isGlobal;
    }

    /**
     * Network group Id.
     * 
     */
    @InputImport(name="networkGroupId")
      private final @Nullable Input<String> networkGroupId;

    public Input<String> getNetworkGroupId() {
        return this.networkGroupId == null ? Input.empty() : this.networkGroupId;
    }

    /**
     * Flag if need to use hub gateway.
     * 
     */
    @InputImport(name="useHubGateway")
      private final @Nullable Input<Either<String,UseHubGateway>> useHubGateway;

    public Input<Either<String,UseHubGateway>> getUseHubGateway() {
        return this.useHubGateway == null ? Input.empty() : this.useHubGateway;
    }

    public ConnectivityGroupItemArgs(
        @Nullable Input<Either<String,GroupConnectivity>> groupConnectivity,
        @Nullable Input<Either<String,IsGlobal>> isGlobal,
        @Nullable Input<String> networkGroupId,
        @Nullable Input<Either<String,UseHubGateway>> useHubGateway) {
        this.groupConnectivity = groupConnectivity;
        this.isGlobal = isGlobal;
        this.networkGroupId = networkGroupId;
        this.useHubGateway = useHubGateway;
    }

    private ConnectivityGroupItemArgs() {
        this.groupConnectivity = Input.empty();
        this.isGlobal = Input.empty();
        this.networkGroupId = Input.empty();
        this.useHubGateway = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityGroupItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,GroupConnectivity>> groupConnectivity;
        private @Nullable Input<Either<String,IsGlobal>> isGlobal;
        private @Nullable Input<String> networkGroupId;
        private @Nullable Input<Either<String,UseHubGateway>> useHubGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityGroupItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupConnectivity = defaults.groupConnectivity;
    	      this.isGlobal = defaults.isGlobal;
    	      this.networkGroupId = defaults.networkGroupId;
    	      this.useHubGateway = defaults.useHubGateway;
        }

        public Builder groupConnectivity(@Nullable Input<Either<String,GroupConnectivity>> groupConnectivity) {
            this.groupConnectivity = groupConnectivity;
            return this;
        }

        public Builder groupConnectivity(@Nullable Either<String,GroupConnectivity> groupConnectivity) {
            this.groupConnectivity = Input.ofNullable(groupConnectivity);
            return this;
        }

        public Builder isGlobal(@Nullable Input<Either<String,IsGlobal>> isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder isGlobal(@Nullable Either<String,IsGlobal> isGlobal) {
            this.isGlobal = Input.ofNullable(isGlobal);
            return this;
        }

        public Builder networkGroupId(@Nullable Input<String> networkGroupId) {
            this.networkGroupId = networkGroupId;
            return this;
        }

        public Builder networkGroupId(@Nullable String networkGroupId) {
            this.networkGroupId = Input.ofNullable(networkGroupId);
            return this;
        }

        public Builder useHubGateway(@Nullable Input<Either<String,UseHubGateway>> useHubGateway) {
            this.useHubGateway = useHubGateway;
            return this;
        }

        public Builder useHubGateway(@Nullable Either<String,UseHubGateway> useHubGateway) {
            this.useHubGateway = Input.ofNullable(useHubGateway);
            return this;
        }
        public ConnectivityGroupItemArgs build() {
            return new ConnectivityGroupItemArgs(groupConnectivity, isGlobal, networkGroupId, useHubGateway);
        }
    }
}
