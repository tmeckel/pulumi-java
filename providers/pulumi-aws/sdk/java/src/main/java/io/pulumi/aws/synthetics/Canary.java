// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.synthetics;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.synthetics.CanaryArgs;
import io.pulumi.aws.synthetics.inputs.CanaryState;
import io.pulumi.aws.synthetics.outputs.CanaryArtifactConfig;
import io.pulumi.aws.synthetics.outputs.CanaryRunConfig;
import io.pulumi.aws.synthetics.outputs.CanarySchedule;
import io.pulumi.aws.synthetics.outputs.CanaryTimeline;
import io.pulumi.aws.synthetics.outputs.CanaryVpcConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Synthetics Canary resource.
 * 
 * > **NOTE:** When you create a canary, AWS creates supporting implicit resources. See the Amazon CloudWatch Synthetics documentation on [DeleteCanary](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DeleteCanary.html) for a full list. Neither AWS nor this provider deletes these implicit resources automatically when the canary is deleted. Before deleting a canary, ensure you have all the information about the canary that you need to delete the implicit resources using the AWS Console, or AWS CLI.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Synthetics Canaries can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:synthetics/canary:Canary some some-canary
 * ```
 * 
 */
@ResourceType(type="aws:synthetics/canary:Canary")
public class Canary extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Canary.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Canary.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * 
     */
    @Export(name="artifactConfig", type=CanaryArtifactConfig.class, parameters={})
    private Output</* @Nullable */ CanaryArtifactConfig> artifactConfig;

    /**
     * @return configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * 
     */
    public Output</* @Nullable */ CanaryArtifactConfig> getArtifactConfig() {
        return this.artifactConfig;
    }
    /**
     * Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     * 
     */
    @Export(name="artifactS3Location", type=String.class, parameters={})
    private Output<String> artifactS3Location;

    /**
     * @return Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     * 
     */
    public Output<String> getArtifactS3Location() {
        return this.artifactS3Location;
    }
    /**
     * ARN of the Lambda function that is used as your canary's engine.
     * 
     */
    @Export(name="engineArn", type=String.class, parameters={})
    private Output<String> engineArn;

    /**
     * @return ARN of the Lambda function that is used as your canary's engine.
     * 
     */
    public Output<String> getEngineArn() {
        return this.engineArn;
    }
    /**
     * ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     * 
     */
    @Export(name="executionRoleArn", type=String.class, parameters={})
    private Output<String> executionRoleArn;

    /**
     * @return ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     * 
     */
    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    @Export(name="failureRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> failureRetentionPeriod;

    /**
     * @return Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    public Output</* @Nullable */ Integer> getFailureRetentionPeriod() {
        return this.failureRetentionPeriod;
    }
    /**
     * Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     * 
     */
    @Export(name="handler", type=String.class, parameters={})
    private Output<String> handler;

    /**
     * @return Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     * 
     */
    public Output<String> getHandler() {
        return this.handler;
    }
    /**
     * Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Configuration block for individual canary runs. Detailed below.
     * 
     */
    @Export(name="runConfig", type=CanaryRunConfig.class, parameters={})
    private Output<CanaryRunConfig> runConfig;

    /**
     * @return Configuration block for individual canary runs. Detailed below.
     * 
     */
    public Output<CanaryRunConfig> getRunConfig() {
        return this.runConfig;
    }
    /**
     * Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     * 
     */
    @Export(name="runtimeVersion", type=String.class, parameters={})
    private Output<String> runtimeVersion;

    /**
     * @return Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     * 
     */
    public Output<String> getRuntimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * Full bucket name which is used if your canary script is located in S3. The bucket must already exist. Specify the full bucket name including s3:// as the start of the bucket name. **Conflicts with `zip_file`.**
     * 
     */
    @Export(name="s3Bucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> s3Bucket;

    /**
     * @return Full bucket name which is used if your canary script is located in S3. The bucket must already exist. Specify the full bucket name including s3:// as the start of the bucket name. **Conflicts with `zip_file`.**
     * 
     */
    public Output</* @Nullable */ String> getS3Bucket() {
        return this.s3Bucket;
    }
    /**
     * S3 key of your script. **Conflicts with `zip_file`.**
     * 
     */
    @Export(name="s3Key", type=String.class, parameters={})
    private Output</* @Nullable */ String> s3Key;

    /**
     * @return S3 key of your script. **Conflicts with `zip_file`.**
     * 
     */
    public Output</* @Nullable */ String> getS3Key() {
        return this.s3Key;
    }
    /**
     * S3 version ID of your script. **Conflicts with `zip_file`.**
     * 
     */
    @Export(name="s3Version", type=String.class, parameters={})
    private Output</* @Nullable */ String> s3Version;

    /**
     * @return S3 version ID of your script. **Conflicts with `zip_file`.**
     * 
     */
    public Output</* @Nullable */ String> getS3Version() {
        return this.s3Version;
    }
    /**
     * Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     * 
     */
    @Export(name="schedule", type=CanarySchedule.class, parameters={})
    private Output<CanarySchedule> schedule;

    /**
     * @return Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     * 
     */
    public Output<CanarySchedule> getSchedule() {
        return this.schedule;
    }
    /**
     * ARN of the Lambda layer where Synthetics stores the canary script code.
     * 
     */
    @Export(name="sourceLocationArn", type=String.class, parameters={})
    private Output<String> sourceLocationArn;

    /**
     * @return ARN of the Lambda layer where Synthetics stores the canary script code.
     * 
     */
    public Output<String> getSourceLocationArn() {
        return this.sourceLocationArn;
    }
    /**
     * Whether to run or stop the canary.
     * 
     */
    @Export(name="startCanary", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> startCanary;

    /**
     * @return Whether to run or stop the canary.
     * 
     */
    public Output</* @Nullable */ Boolean> getStartCanary() {
        return this.startCanary;
    }
    /**
     * Canary status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Canary status.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    @Export(name="successRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> successRetentionPeriod;

    /**
     * @return Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    public Output</* @Nullable */ Integer> getSuccessRetentionPeriod() {
        return this.successRetentionPeriod;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     * 
     */
    @Export(name="timelines", type=List.class, parameters={CanaryTimeline.class})
    private Output<List<CanaryTimeline>> timelines;

    /**
     * @return Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     * 
     */
    public Output<List<CanaryTimeline>> getTimelines() {
        return this.timelines;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="vpcConfig", type=CanaryVpcConfig.class, parameters={})
    private Output</* @Nullable */ CanaryVpcConfig> vpcConfig;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output</* @Nullable */ CanaryVpcConfig> getVpcConfig() {
        return this.vpcConfig;
    }
    /**
     * ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 5 MB. **Conflicts with `s3_bucket`, `s3_key`, and `s3_version`.**
     * 
     */
    @Export(name="zipFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> zipFile;

    /**
     * @return ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 5 MB. **Conflicts with `s3_bucket`, `s3_key`, and `s3_version`.**
     * 
     */
    public Output</* @Nullable */ String> getZipFile() {
        return this.zipFile;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Canary(String name) {
        this(name, CanaryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Canary(String name, CanaryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Canary(String name, CanaryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:synthetics/canary:Canary", name, args == null ? CanaryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Canary(String name, Output<String> id, @Nullable CanaryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:synthetics/canary:Canary", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Canary get(String name, Output<String> id, @Nullable CanaryState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Canary(name, id, state, options);
    }
}
