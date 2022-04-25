// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption at rest settings for disk or snapshot
 * 
 */
public final class EncryptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionResponse Empty = new EncryptionResponse();

    /**
     * ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    @Import(name="diskEncryptionSetId")
    private @Nullable String diskEncryptionSetId;

    /**
     * @return ResourceId of the disk encryption set to use for enabling encryption at rest.
     * 
     */
    public Optional<String> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * The type of key used to encrypt the data of the disk.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of key used to encrypt the data of the disk.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private EncryptionResponse() {}

    private EncryptionResponse(EncryptionResponse $) {
        this.diskEncryptionSetId = $.diskEncryptionSetId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionResponse $;

        public Builder() {
            $ = new EncryptionResponse();
        }

        public Builder(EncryptionResponse defaults) {
            $ = new EncryptionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskEncryptionSetId ResourceId of the disk encryption set to use for enabling encryption at rest.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            $.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        /**
         * @param type The type of key used to encrypt the data of the disk.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public EncryptionResponse build() {
            return $;
        }
    }

}
