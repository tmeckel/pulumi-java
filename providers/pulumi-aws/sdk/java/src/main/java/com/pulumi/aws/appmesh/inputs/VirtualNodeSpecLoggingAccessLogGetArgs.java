// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.VirtualNodeSpecLoggingAccessLogFileGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNodeSpecLoggingAccessLogGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecLoggingAccessLogGetArgs Empty = new VirtualNodeSpecLoggingAccessLogGetArgs();

    /**
     * The file object to send virtual node access logs to.
     * 
     */
    @Import(name="file")
    private @Nullable Output<VirtualNodeSpecLoggingAccessLogFileGetArgs> file;

    /**
     * @return The file object to send virtual node access logs to.
     * 
     */
    public Optional<Output<VirtualNodeSpecLoggingAccessLogFileGetArgs>> file() {
        return Optional.ofNullable(this.file);
    }

    private VirtualNodeSpecLoggingAccessLogGetArgs() {}

    private VirtualNodeSpecLoggingAccessLogGetArgs(VirtualNodeSpecLoggingAccessLogGetArgs $) {
        this.file = $.file;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNodeSpecLoggingAccessLogGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecLoggingAccessLogGetArgs $;

        public Builder() {
            $ = new VirtualNodeSpecLoggingAccessLogGetArgs();
        }

        public Builder(VirtualNodeSpecLoggingAccessLogGetArgs defaults) {
            $ = new VirtualNodeSpecLoggingAccessLogGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param file The file object to send virtual node access logs to.
         * 
         * @return builder
         * 
         */
        public Builder file(@Nullable Output<VirtualNodeSpecLoggingAccessLogFileGetArgs> file) {
            $.file = file;
            return this;
        }

        /**
         * @param file The file object to send virtual node access logs to.
         * 
         * @return builder
         * 
         */
        public Builder file(VirtualNodeSpecLoggingAccessLogFileGetArgs file) {
            return file(Output.of(file));
        }

        public VirtualNodeSpecLoggingAccessLogGetArgs build() {
            return $;
        }
    }

}
