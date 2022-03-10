// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.enums.ObjectTypeFieldContentType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ObjectTypeField {
    /**
     * The content type of the field. Used for determining equality when searching.
     * 
     */
    private final @Nullable ObjectTypeFieldContentType contentType;
    /**
     * A field of a ProfileObject. For example: _source.FirstName, where "_source" is a ProfileObjectType of a Zendesk user and "FirstName" is a field in that ObjectType.
     * 
     */
    private final @Nullable String source;
    /**
     * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * 
     */
    private final @Nullable String target;

    @OutputCustomType.Constructor
    private ObjectTypeField(
        @OutputCustomType.Parameter("contentType") @Nullable ObjectTypeFieldContentType contentType,
        @OutputCustomType.Parameter("source") @Nullable String source,
        @OutputCustomType.Parameter("target") @Nullable String target) {
        this.contentType = contentType;
        this.source = source;
        this.target = target;
    }

    /**
     * The content type of the field. Used for determining equality when searching.
     * 
    */
    public Optional<ObjectTypeFieldContentType> getContentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * A field of a ProfileObject. For example: _source.FirstName, where "_source" is a ProfileObjectType of a Zendesk user and "FirstName" is a field in that ObjectType.
     * 
    */
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * 
    */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ObjectTypeFieldContentType contentType;
        private @Nullable String source;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
        }

        public Builder contentType(@Nullable ObjectTypeFieldContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public ObjectTypeField build() {
            return new ObjectTypeField(contentType, source, target);
        }
    }
}
