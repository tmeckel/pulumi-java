// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.PerInstanceConfigPreservedStateDiskArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PerInstanceConfigPreservedStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PerInstanceConfigPreservedStateArgs Empty = new PerInstanceConfigPreservedStateArgs();

    /**
     * Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    @Import(name="disks")
      private final @Nullable Output<List<PerInstanceConfigPreservedStateDiskArgs>> disks;

    public Output<List<PerInstanceConfigPreservedStateDiskArgs>> getDisks() {
        return this.disks == null ? Codegen.empty() : this.disks;
    }

    /**
     * Preserved metadata defined for this instance. This is a list of key->value pairs.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    public PerInstanceConfigPreservedStateArgs(
        @Nullable Output<List<PerInstanceConfigPreservedStateDiskArgs>> disks,
        @Nullable Output<Map<String,String>> metadata) {
        this.disks = disks;
        this.metadata = metadata;
    }

    private PerInstanceConfigPreservedStateArgs() {
        this.disks = Codegen.empty();
        this.metadata = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerInstanceConfigPreservedStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PerInstanceConfigPreservedStateDiskArgs>> disks;
        private @Nullable Output<Map<String,String>> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(PerInstanceConfigPreservedStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.metadata = defaults.metadata;
        }

        public Builder disks(@Nullable Output<List<PerInstanceConfigPreservedStateDiskArgs>> disks) {
            this.disks = disks;
            return this;
        }
        public Builder disks(@Nullable List<PerInstanceConfigPreservedStateDiskArgs> disks) {
            this.disks = Codegen.ofNullable(disks);
            return this;
        }
        public Builder disks(PerInstanceConfigPreservedStateDiskArgs... disks) {
            return disks(List.of(disks));
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }        public PerInstanceConfigPreservedStateArgs build() {
            return new PerInstanceConfigPreservedStateArgs(disks, metadata);
        }
    }
}
