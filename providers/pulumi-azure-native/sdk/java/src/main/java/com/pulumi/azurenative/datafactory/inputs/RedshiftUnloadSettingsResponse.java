// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;


/**
 * The Amazon S3 settings needed for the interim Amazon S3 when copying from Amazon Redshift with unload. With this, data from Amazon Redshift source will be unloaded into S3 first and then copied into the targeted sink from the interim S3.
 * 
 */
public final class RedshiftUnloadSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final RedshiftUnloadSettingsResponse Empty = new RedshiftUnloadSettingsResponse();

    /**
     * The bucket of the interim Amazon S3 which will be used to store the unloaded data from Amazon Redshift source. The bucket must be in the same region as the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="bucketName", required=true)
    private Object bucketName;

    /**
     * @return The bucket of the interim Amazon S3 which will be used to store the unloaded data from Amazon Redshift source. The bucket must be in the same region as the Amazon Redshift source. Type: string (or Expression with resultType string).
     * 
     */
    public Object bucketName() {
        return this.bucketName;
    }

    /**
     * The name of the Amazon S3 linked service which will be used for the unload operation when copying from the Amazon Redshift source.
     * 
     */
    @Import(name="s3LinkedServiceName", required=true)
    private LinkedServiceReferenceResponse s3LinkedServiceName;

    /**
     * @return The name of the Amazon S3 linked service which will be used for the unload operation when copying from the Amazon Redshift source.
     * 
     */
    public LinkedServiceReferenceResponse s3LinkedServiceName() {
        return this.s3LinkedServiceName;
    }

    private RedshiftUnloadSettingsResponse() {}

    private RedshiftUnloadSettingsResponse(RedshiftUnloadSettingsResponse $) {
        this.bucketName = $.bucketName;
        this.s3LinkedServiceName = $.s3LinkedServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedshiftUnloadSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedshiftUnloadSettingsResponse $;

        public Builder() {
            $ = new RedshiftUnloadSettingsResponse();
        }

        public Builder(RedshiftUnloadSettingsResponse defaults) {
            $ = new RedshiftUnloadSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The bucket of the interim Amazon S3 which will be used to store the unloaded data from Amazon Redshift source. The bucket must be in the same region as the Amazon Redshift source. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Object bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param s3LinkedServiceName The name of the Amazon S3 linked service which will be used for the unload operation when copying from the Amazon Redshift source.
         * 
         * @return builder
         * 
         */
        public Builder s3LinkedServiceName(LinkedServiceReferenceResponse s3LinkedServiceName) {
            $.s3LinkedServiceName = s3LinkedServiceName;
            return this;
        }

        public RedshiftUnloadSettingsResponse build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.s3LinkedServiceName = Objects.requireNonNull($.s3LinkedServiceName, "expected parameter 's3LinkedServiceName' to be non-null");
            return $;
        }
    }

}
