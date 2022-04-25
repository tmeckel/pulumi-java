// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ObjectFieldSelector selects an APIVersioned field of an object.
 * 
 */
public final class ObjectFieldSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectFieldSelectorArgs Empty = new ObjectFieldSelectorArgs();

    /**
     * Version of the schema the FieldPath is written in terms of, defaults to &#34;v1&#34;.
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    /**
     * @return Version of the schema the FieldPath is written in terms of, defaults to &#34;v1&#34;.
     * 
     */
    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * Path of the field to select in the specified API version.
     * 
     */
    @Import(name="fieldPath", required=true)
    private Output<String> fieldPath;

    /**
     * @return Path of the field to select in the specified API version.
     * 
     */
    public Output<String> fieldPath() {
        return this.fieldPath;
    }

    private ObjectFieldSelectorArgs() {}

    private ObjectFieldSelectorArgs(ObjectFieldSelectorArgs $) {
        this.apiVersion = $.apiVersion;
        this.fieldPath = $.fieldPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectFieldSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectFieldSelectorArgs $;

        public Builder() {
            $ = new ObjectFieldSelectorArgs();
        }

        public Builder(ObjectFieldSelectorArgs defaults) {
            $ = new ObjectFieldSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiVersion Version of the schema the FieldPath is written in terms of, defaults to &#34;v1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        /**
         * @param apiVersion Version of the schema the FieldPath is written in terms of, defaults to &#34;v1&#34;.
         * 
         * @return builder
         * 
         */
        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        /**
         * @param fieldPath Path of the field to select in the specified API version.
         * 
         * @return builder
         * 
         */
        public Builder fieldPath(Output<String> fieldPath) {
            $.fieldPath = fieldPath;
            return this;
        }

        /**
         * @param fieldPath Path of the field to select in the specified API version.
         * 
         * @return builder
         * 
         */
        public Builder fieldPath(String fieldPath) {
            return fieldPath(Output.of(fieldPath));
        }

        public ObjectFieldSelectorArgs build() {
            $.fieldPath = Objects.requireNonNull($.fieldPath, "expected parameter 'fieldPath' to be non-null");
            return $;
        }
    }

}
