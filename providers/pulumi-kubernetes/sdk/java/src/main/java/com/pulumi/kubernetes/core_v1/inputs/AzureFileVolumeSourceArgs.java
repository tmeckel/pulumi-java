// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 * 
 */
public final class AzureFileVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFileVolumeSourceArgs Empty = new AzureFileVolumeSourceArgs();

    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * the name of secret that contains Azure Storage Account Name and Key
     * 
     */
    @Import(name="secretName", required=true)
    private Output<String> secretName;

    /**
     * @return the name of secret that contains Azure Storage Account Name and Key
     * 
     */
    public Output<String> secretName() {
        return this.secretName;
    }

    /**
     * Share Name
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    /**
     * @return Share Name
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    private AzureFileVolumeSourceArgs() {}

    private AzureFileVolumeSourceArgs(AzureFileVolumeSourceArgs $) {
        this.readOnly = $.readOnly;
        this.secretName = $.secretName;
        this.shareName = $.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFileVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFileVolumeSourceArgs $;

        public Builder() {
            $ = new AzureFileVolumeSourceArgs();
        }

        public Builder(AzureFileVolumeSourceArgs defaults) {
            $ = new AzureFileVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param secretName the name of secret that contains Azure Storage Account Name and Key
         * 
         * @return builder
         * 
         */
        public Builder secretName(Output<String> secretName) {
            $.secretName = secretName;
            return this;
        }

        /**
         * @param secretName the name of secret that contains Azure Storage Account Name and Key
         * 
         * @return builder
         * 
         */
        public Builder secretName(String secretName) {
            return secretName(Output.of(secretName));
        }

        /**
         * @param shareName Share Name
         * 
         * @return builder
         * 
         */
        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName Share Name
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public AzureFileVolumeSourceArgs build() {
            $.secretName = Objects.requireNonNull($.secretName, "expected parameter 'secretName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            return $;
        }
    }

}
