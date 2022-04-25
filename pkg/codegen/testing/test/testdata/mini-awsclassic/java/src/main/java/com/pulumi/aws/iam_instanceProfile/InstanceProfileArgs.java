// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam_instanceProfile;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceProfileArgs Empty = new InstanceProfileArgs();

    /**
     * Name of the role to add to the profile.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Name of the role to add to the profile.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private InstanceProfileArgs() {}

    private InstanceProfileArgs(InstanceProfileArgs $) {
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceProfileArgs $;

        public Builder() {
            $ = new InstanceProfileArgs();
        }

        public Builder(InstanceProfileArgs defaults) {
            $ = new InstanceProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param role Name of the role to add to the profile.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Name of the role to add to the profile.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public InstanceProfileArgs build() {
            return $;
        }
    }

}
