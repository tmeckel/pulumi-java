// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The entity reference.
 * 
 */
public final class EntityReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final EntityReferenceResponse Empty = new EntityReferenceResponse();

    /**
     * The name of this referenced entity.
     * 
     */
    @Import(name="referenceName")
    private @Nullable String referenceName;

    /**
     * @return The name of this referenced entity.
     * 
     */
    public Optional<String> referenceName() {
        return Optional.ofNullable(this.referenceName);
    }

    /**
     * The type of this referenced entity.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of this referenced entity.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private EntityReferenceResponse() {}

    private EntityReferenceResponse(EntityReferenceResponse $) {
        this.referenceName = $.referenceName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntityReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntityReferenceResponse $;

        public Builder() {
            $ = new EntityReferenceResponse();
        }

        public Builder(EntityReferenceResponse defaults) {
            $ = new EntityReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param referenceName The name of this referenced entity.
         * 
         * @return builder
         * 
         */
        public Builder referenceName(@Nullable String referenceName) {
            $.referenceName = referenceName;
            return this;
        }

        /**
         * @param type The type of this referenced entity.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public EntityReferenceResponse build() {
            return $;
        }
    }

}
