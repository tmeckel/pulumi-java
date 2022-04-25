// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The location of amazon S3 dataset.
 * 
 */
public final class AmazonS3LocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmazonS3LocationArgs Empty = new AmazonS3LocationArgs();

    /**
     * Specify the bucketName of amazon S3. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<Object> bucketName;

    /**
     * @return Specify the bucketName of amazon S3. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Output<Object>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="fileName")
    private @Nullable Output<Object> fileName;

    /**
     * @return Specify the file name of dataset. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> fileName() {
        return Optional.ofNullable(this.fileName);
    }

    /**
     * Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="folderPath")
    private @Nullable Output<Object> folderPath;

    /**
     * @return Specify the folder path of dataset. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Output<Object>> folderPath() {
        return Optional.ofNullable(this.folderPath);
    }

    /**
     * Type of dataset storage location.
     * Expected value is &#39;AmazonS3Location&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of dataset storage location.
     * Expected value is &#39;AmazonS3Location&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Specify the version of amazon S3. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="version")
    private @Nullable Output<Object> version;

    /**
     * @return Specify the version of amazon S3. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> version() {
        return Optional.ofNullable(this.version);
    }

    private AmazonS3LocationArgs() {}

    private AmazonS3LocationArgs(AmazonS3LocationArgs $) {
        this.bucketName = $.bucketName;
        this.fileName = $.fileName;
        this.folderPath = $.folderPath;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmazonS3LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmazonS3LocationArgs $;

        public Builder() {
            $ = new AmazonS3LocationArgs();
        }

        public Builder(AmazonS3LocationArgs defaults) {
            $ = new AmazonS3LocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName Specify the bucketName of amazon S3. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<Object> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName Specify the bucketName of amazon S3. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Object bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param fileName Specify the file name of dataset. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileName(@Nullable Output<Object> fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param fileName Specify the file name of dataset. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder fileName(Object fileName) {
            return fileName(Output.of(fileName));
        }

        /**
         * @param folderPath Specify the folder path of dataset. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder folderPath(@Nullable Output<Object> folderPath) {
            $.folderPath = folderPath;
            return this;
        }

        /**
         * @param folderPath Specify the folder path of dataset. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder folderPath(Object folderPath) {
            return folderPath(Output.of(folderPath));
        }

        /**
         * @param type Type of dataset storage location.
         * Expected value is &#39;AmazonS3Location&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of dataset storage location.
         * Expected value is &#39;AmazonS3Location&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param version Specify the version of amazon S3. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Object> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Specify the version of amazon S3. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder version(Object version) {
            return version(Output.of(version));
        }

        public AmazonS3LocationArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
