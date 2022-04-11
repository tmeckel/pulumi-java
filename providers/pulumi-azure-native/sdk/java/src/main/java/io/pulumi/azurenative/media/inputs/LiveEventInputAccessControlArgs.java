// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.IPAccessControlArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The IP access control for live event input.
 * 
 */
public final class LiveEventInputAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiveEventInputAccessControlArgs Empty = new LiveEventInputAccessControlArgs();

    /**
     * The IP access control properties.
     * 
     */
    @Import(name="ip")
      private final @Nullable Output<IPAccessControlArgs> ip;

    public Output<IPAccessControlArgs> getIp() {
        return this.ip == null ? Codegen.empty() : this.ip;
    }

    public LiveEventInputAccessControlArgs(@Nullable Output<IPAccessControlArgs> ip) {
        this.ip = ip;
    }

    private LiveEventInputAccessControlArgs() {
        this.ip = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventInputAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IPAccessControlArgs> ip;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventInputAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
        }

        public Builder ip(@Nullable Output<IPAccessControlArgs> ip) {
            this.ip = ip;
            return this;
        }
        public Builder ip(@Nullable IPAccessControlArgs ip) {
            this.ip = Codegen.ofNullable(ip);
            return this;
        }        public LiveEventInputAccessControlArgs build() {
            return new LiveEventInputAccessControlArgs(ip);
        }
    }
}
