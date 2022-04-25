// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs;

import com.pulumi.awsnative.ivs.inputs.PlaybackKeyPairTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlaybackKeyPairArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlaybackKeyPairArgs Empty = new PlaybackKeyPairArgs();

    /**
     * An arbitrary string (a nickname) assigned to a playback key pair that helps the customer identify that resource. The value does not need to be unique.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return An arbitrary string (a nickname) assigned to a playback key pair that helps the customer identify that resource. The value does not need to be unique.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The public portion of a customer-generated key pair.
     * 
     */
    @Import(name="publicKeyMaterial", required=true)
    private Output<String> publicKeyMaterial;

    /**
     * @return The public portion of a customer-generated key pair.
     * 
     */
    public Output<String> publicKeyMaterial() {
        return this.publicKeyMaterial;
    }

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<PlaybackKeyPairTagArgs>> tags;

    /**
     * @return A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    public Optional<Output<List<PlaybackKeyPairTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PlaybackKeyPairArgs() {}

    private PlaybackKeyPairArgs(PlaybackKeyPairArgs $) {
        this.name = $.name;
        this.publicKeyMaterial = $.publicKeyMaterial;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlaybackKeyPairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlaybackKeyPairArgs $;

        public Builder() {
            $ = new PlaybackKeyPairArgs();
        }

        public Builder(PlaybackKeyPairArgs defaults) {
            $ = new PlaybackKeyPairArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name An arbitrary string (a nickname) assigned to a playback key pair that helps the customer identify that resource. The value does not need to be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name An arbitrary string (a nickname) assigned to a playback key pair that helps the customer identify that resource. The value does not need to be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publicKeyMaterial The public portion of a customer-generated key pair.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyMaterial(Output<String> publicKeyMaterial) {
            $.publicKeyMaterial = publicKeyMaterial;
            return this;
        }

        /**
         * @param publicKeyMaterial The public portion of a customer-generated key pair.
         * 
         * @return builder
         * 
         */
        public Builder publicKeyMaterial(String publicKeyMaterial) {
            return publicKeyMaterial(Output.of(publicKeyMaterial));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset model.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<PlaybackKeyPairTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset model.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<PlaybackKeyPairTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of key-value pairs that contain metadata for the asset model.
         * 
         * @return builder
         * 
         */
        public Builder tags(PlaybackKeyPairTagArgs... tags) {
            return tags(List.of(tags));
        }

        public PlaybackKeyPairArgs build() {
            $.publicKeyMaterial = Objects.requireNonNull($.publicKeyMaterial, "expected parameter 'publicKeyMaterial' to be non-null");
            return $;
        }
    }

}
