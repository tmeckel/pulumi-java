// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1beta1.enums.RelationshipNoteType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * RelationshipNote represents an SPDX Relationship section: https://spdx.github.io/spdx-spec/7-relationships-between-SPDX-elements/
 * 
 */
public final class RelationshipNoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RelationshipNoteArgs Empty = new RelationshipNoteArgs();

    /**
     * The type of relationship between the source and target SPDX elements
     * 
     */
    @Import(name="type")
    private @Nullable Output<RelationshipNoteType> type;

    /**
     * @return The type of relationship between the source and target SPDX elements
     * 
     */
    public Optional<Output<RelationshipNoteType>> type() {
        return Optional.ofNullable(this.type);
    }

    private RelationshipNoteArgs() {}

    private RelationshipNoteArgs(RelationshipNoteArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RelationshipNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RelationshipNoteArgs $;

        public Builder() {
            $ = new RelationshipNoteArgs();
        }

        public Builder(RelationshipNoteArgs defaults) {
            $ = new RelationshipNoteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of relationship between the source and target SPDX elements
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<RelationshipNoteType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of relationship between the source and target SPDX elements
         * 
         * @return builder
         * 
         */
        public Builder type(RelationshipNoteType type) {
            return type(Output.of(type));
        }

        public RelationshipNoteArgs build() {
            return $;
        }
    }

}
