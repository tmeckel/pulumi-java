// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.policysimulator_v1beta1.inputs.GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderReplayArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderReplayArgs Empty = new FolderReplayArgs();

    /**
     * The configuration used for the `Replay`.
     * 
     */
    @Import(name="config", required=true)
      private final Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config;

    public Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> getConfig() {
        return this.config;
    }

    @Import(name="folderId", required=true)
      private final Output<String> folderId;

    public Output<String> getFolderId() {
        return this.folderId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    public FolderReplayArgs(
        Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config,
        Output<String> folderId,
        @Nullable Output<String> location) {
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.folderId = Objects.requireNonNull(folderId, "expected parameter 'folderId' to be non-null");
        this.location = location;
    }

    private FolderReplayArgs() {
        this.config = Codegen.empty();
        this.folderId = Codegen.empty();
        this.location = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderReplayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config;
        private Output<String> folderId;
        private @Nullable Output<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderReplayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.folderId = defaults.folderId;
    	      this.location = defaults.location;
        }

        public Builder config(Output<GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder config(GoogleCloudPolicysimulatorV1beta1ReplayConfigArgs config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }
        public Builder folderId(Output<String> folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }
        public Builder folderId(String folderId) {
            this.folderId = Output.of(Objects.requireNonNull(folderId));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }        public FolderReplayArgs build() {
            return new FolderReplayArgs(config, folderId, location);
        }
    }
}
