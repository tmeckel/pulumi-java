// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.outputs;

import com.google.gson.JsonElement;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedFieldsEntry {
    /**
     * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
     * 
     */
    private final @Nullable String fieldsType;
    /**
     * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
     * 
     */
    private final @Nullable JsonElement fieldsV1;
    /**
     * Manager is an identifier of the workflow managing these fields.
     * 
     */
    private final @Nullable String manager;
    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
     * 
     */
    private final @Nullable String operation;
    /**
     * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
     * 
     */
    private final @Nullable String subresource;
    /**
     * Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'
     * 
     */
    private final @Nullable String time;

    @OutputCustomType.Constructor
    private ManagedFieldsEntry(
        @OutputCustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @OutputCustomType.Parameter("fieldsType") @Nullable String fieldsType,
        @OutputCustomType.Parameter("fieldsV1") @Nullable JsonElement fieldsV1,
        @OutputCustomType.Parameter("manager") @Nullable String manager,
        @OutputCustomType.Parameter("operation") @Nullable String operation,
        @OutputCustomType.Parameter("subresource") @Nullable String subresource,
        @OutputCustomType.Parameter("time") @Nullable String time) {
        this.apiVersion = apiVersion;
        this.fieldsType = fieldsType;
        this.fieldsV1 = fieldsV1;
        this.manager = manager;
        this.operation = operation;
        this.subresource = subresource;
        this.time = time;
    }

    /**
     * APIVersion defines the version of this resource that this field set applies to. The format is "group/version" just like the top-level APIVersion field. It is necessary to track the version of a field set because it cannot be automatically converted.
     * 
    */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * FieldsType is the discriminator for the different fields format and version. There is currently only one possible value: "FieldsV1"
     * 
    */
    public Optional<String> getFieldsType() {
        return Optional.ofNullable(this.fieldsType);
    }
    /**
     * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
     * 
    */
    public Optional<JsonElement> getFieldsV1() {
        return Optional.ofNullable(this.fieldsV1);
    }
    /**
     * Manager is an identifier of the workflow managing these fields.
     * 
    */
    public Optional<String> getManager() {
        return Optional.ofNullable(this.manager);
    }
    /**
     * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The only valid values for this field are 'Apply' and 'Update'.
     * 
    */
    public Optional<String> getOperation() {
        return Optional.ofNullable(this.operation);
    }
    /**
     * Subresource is the name of the subresource used to update that object, or empty string if the object was updated through the main resource. The value of this field is used to distinguish between managers, even if they share the same name. For example, a status update will be distinct from a regular update using the same manager name. Note that the APIVersion field is not related to the Subresource field and it always corresponds to the version of the main resource.
     * 
    */
    public Optional<String> getSubresource() {
        return Optional.ofNullable(this.subresource);
    }
    /**
     * Time is timestamp of when these fields were set. It should always be empty if Operation is 'Apply'
     * 
    */
    public Optional<String> getTime() {
        return Optional.ofNullable(this.time);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedFieldsEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String fieldsType;
        private @Nullable JsonElement fieldsV1;
        private @Nullable String manager;
        private @Nullable String operation;
        private @Nullable String subresource;
        private @Nullable String time;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedFieldsEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.fieldsType = defaults.fieldsType;
    	      this.fieldsV1 = defaults.fieldsV1;
    	      this.manager = defaults.manager;
    	      this.operation = defaults.operation;
    	      this.subresource = defaults.subresource;
    	      this.time = defaults.time;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder fieldsType(@Nullable String fieldsType) {
            this.fieldsType = fieldsType;
            return this;
        }

        public Builder fieldsV1(@Nullable JsonElement fieldsV1) {
            this.fieldsV1 = fieldsV1;
            return this;
        }

        public Builder manager(@Nullable String manager) {
            this.manager = manager;
            return this;
        }

        public Builder operation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }

        public Builder subresource(@Nullable String subresource) {
            this.subresource = subresource;
            return this;
        }

        public Builder time(@Nullable String time) {
            this.time = time;
            return this;
        }
        public ManagedFieldsEntry build() {
            return new ManagedFieldsEntry(apiVersion, fieldsType, fieldsV1, manager, operation, subresource, time);
        }
    }
}
