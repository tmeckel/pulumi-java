// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles;

import io.pulumi.awsnative.customerprofiles.inputs.ObjectTypeFieldMapArgs;
import io.pulumi.awsnative.customerprofiles.inputs.ObjectTypeKeyMapArgs;
import io.pulumi.awsnative.customerprofiles.inputs.ObjectTypeTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectTypeArgs Empty = new ObjectTypeArgs();

    /**
     * Indicates whether a profile should be created when data is received.
     * 
     */
    @Import(name="allowProfileCreation")
      private final @Nullable Output<Boolean> allowProfileCreation;

    public Output<Boolean> getAllowProfileCreation() {
        return this.allowProfileCreation == null ? Codegen.empty() : this.allowProfileCreation;
    }

    /**
     * Description of the profile object type.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The unique name of the domain.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The default encryption key
     * 
     */
    @Import(name="encryptionKey")
      private final @Nullable Output<String> encryptionKey;

    public Output<String> getEncryptionKey() {
        return this.encryptionKey == null ? Codegen.empty() : this.encryptionKey;
    }

    /**
     * The default number of days until the data within the domain expires.
     * 
     */
    @Import(name="expirationDays")
      private final @Nullable Output<Integer> expirationDays;

    public Output<Integer> getExpirationDays() {
        return this.expirationDays == null ? Codegen.empty() : this.expirationDays;
    }

    /**
     * A list of the name and ObjectType field.
     * 
     */
    @Import(name="fields")
      private final @Nullable Output<List<ObjectTypeFieldMapArgs>> fields;

    public Output<List<ObjectTypeFieldMapArgs>> getFields() {
        return this.fields == null ? Codegen.empty() : this.fields;
    }

    /**
     * A list of unique keys that can be used to map data to the profile.
     * 
     */
    @Import(name="keys")
      private final @Nullable Output<List<ObjectTypeKeyMapArgs>> keys;

    public Output<List<ObjectTypeKeyMapArgs>> getKeys() {
        return this.keys == null ? Codegen.empty() : this.keys;
    }

    /**
     * The name of the profile object type.
     * 
     */
    @Import(name="objectTypeName")
      private final @Nullable Output<String> objectTypeName;

    public Output<String> getObjectTypeName() {
        return this.objectTypeName == null ? Codegen.empty() : this.objectTypeName;
    }

    /**
     * The tags (keys and values) associated with the integration.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ObjectTypeTagArgs>> tags;

    public Output<List<ObjectTypeTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A unique identifier for the object template.
     * 
     */
    @Import(name="templateId")
      private final @Nullable Output<String> templateId;

    public Output<String> getTemplateId() {
        return this.templateId == null ? Codegen.empty() : this.templateId;
    }

    public ObjectTypeArgs(
        @Nullable Output<Boolean> allowProfileCreation,
        @Nullable Output<String> description,
        Output<String> domainName,
        @Nullable Output<String> encryptionKey,
        @Nullable Output<Integer> expirationDays,
        @Nullable Output<List<ObjectTypeFieldMapArgs>> fields,
        @Nullable Output<List<ObjectTypeKeyMapArgs>> keys,
        @Nullable Output<String> objectTypeName,
        @Nullable Output<List<ObjectTypeTagArgs>> tags,
        @Nullable Output<String> templateId) {
        this.allowProfileCreation = allowProfileCreation;
        this.description = description;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.encryptionKey = encryptionKey;
        this.expirationDays = expirationDays;
        this.fields = fields;
        this.keys = keys;
        this.objectTypeName = objectTypeName;
        this.tags = tags;
        this.templateId = templateId;
    }

    private ObjectTypeArgs() {
        this.allowProfileCreation = Codegen.empty();
        this.description = Codegen.empty();
        this.domainName = Codegen.empty();
        this.encryptionKey = Codegen.empty();
        this.expirationDays = Codegen.empty();
        this.fields = Codegen.empty();
        this.keys = Codegen.empty();
        this.objectTypeName = Codegen.empty();
        this.tags = Codegen.empty();
        this.templateId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowProfileCreation;
        private @Nullable Output<String> description;
        private Output<String> domainName;
        private @Nullable Output<String> encryptionKey;
        private @Nullable Output<Integer> expirationDays;
        private @Nullable Output<List<ObjectTypeFieldMapArgs>> fields;
        private @Nullable Output<List<ObjectTypeKeyMapArgs>> keys;
        private @Nullable Output<String> objectTypeName;
        private @Nullable Output<List<ObjectTypeTagArgs>> tags;
        private @Nullable Output<String> templateId;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowProfileCreation = defaults.allowProfileCreation;
    	      this.description = defaults.description;
    	      this.domainName = defaults.domainName;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.expirationDays = defaults.expirationDays;
    	      this.fields = defaults.fields;
    	      this.keys = defaults.keys;
    	      this.objectTypeName = defaults.objectTypeName;
    	      this.tags = defaults.tags;
    	      this.templateId = defaults.templateId;
        }

        public Builder allowProfileCreation(@Nullable Output<Boolean> allowProfileCreation) {
            this.allowProfileCreation = allowProfileCreation;
            return this;
        }
        public Builder allowProfileCreation(@Nullable Boolean allowProfileCreation) {
            this.allowProfileCreation = Codegen.ofNullable(allowProfileCreation);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder encryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = Codegen.ofNullable(encryptionKey);
            return this;
        }
        public Builder expirationDays(@Nullable Output<Integer> expirationDays) {
            this.expirationDays = expirationDays;
            return this;
        }
        public Builder expirationDays(@Nullable Integer expirationDays) {
            this.expirationDays = Codegen.ofNullable(expirationDays);
            return this;
        }
        public Builder fields(@Nullable Output<List<ObjectTypeFieldMapArgs>> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(@Nullable List<ObjectTypeFieldMapArgs> fields) {
            this.fields = Codegen.ofNullable(fields);
            return this;
        }
        public Builder fields(ObjectTypeFieldMapArgs... fields) {
            return fields(List.of(fields));
        }
        public Builder keys(@Nullable Output<List<ObjectTypeKeyMapArgs>> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(@Nullable List<ObjectTypeKeyMapArgs> keys) {
            this.keys = Codegen.ofNullable(keys);
            return this;
        }
        public Builder keys(ObjectTypeKeyMapArgs... keys) {
            return keys(List.of(keys));
        }
        public Builder objectTypeName(@Nullable Output<String> objectTypeName) {
            this.objectTypeName = objectTypeName;
            return this;
        }
        public Builder objectTypeName(@Nullable String objectTypeName) {
            this.objectTypeName = Codegen.ofNullable(objectTypeName);
            return this;
        }
        public Builder tags(@Nullable Output<List<ObjectTypeTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ObjectTypeTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ObjectTypeTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder templateId(@Nullable Output<String> templateId) {
            this.templateId = templateId;
            return this;
        }
        public Builder templateId(@Nullable String templateId) {
            this.templateId = Codegen.ofNullable(templateId);
            return this;
        }        public ObjectTypeArgs build() {
            return new ObjectTypeArgs(allowProfileCreation, description, domainName, encryptionKey, expirationDays, fields, keys, objectTypeName, tags, templateId);
        }
    }
}
