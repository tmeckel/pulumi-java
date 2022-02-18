// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.contactcenterinsights_v1.PhraseMatcherArgs;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a phrase matcher.
 * 
 */
@ResourceType(type="google-native:contactcenterinsights/v1:PhraseMatcher")
public class PhraseMatcher extends io.pulumi.resources.CustomResource {
    /**
     * The most recent time at which the activation status was updated.
     * 
     */
    @OutputExport(name="activationUpdateTime", type=String.class, parameters={})
    private Output<String> activationUpdateTime;

    /**
     * @return The most recent time at which the activation status was updated.
     * 
     */
    public Output<String> getActivationUpdateTime() {
        return this.activationUpdateTime;
    }
    /**
     * Applies the phrase matcher only when it is active.
     * 
     */
    @OutputExport(name="active", type=Boolean.class, parameters={})
    private Output<Boolean> active;

    /**
     * @return Applies the phrase matcher only when it is active.
     * 
     */
    public Output<Boolean> getActive() {
        return this.active;
    }
    /**
     * The human-readable name of the phrase matcher.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the phrase matcher.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the phrase matcher. Format: projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the phrase matcher. Format: projects/{project}/locations/{location}/phraseMatchers/{phrase_matcher}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A list of phase match rule groups that are included in this matcher.
     * 
     */
    @OutputExport(name="phraseMatchRuleGroups", type=List.class, parameters={GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse.class})
    private Output<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse>> phraseMatchRuleGroups;

    /**
     * @return A list of phase match rule groups that are included in this matcher.
     * 
     */
    public Output<List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse>> getPhraseMatchRuleGroups() {
        return this.phraseMatchRuleGroups;
    }
    /**
     * The timestamp of when the revision was created. It is also the create time when a new matcher is added.
     * 
     */
    @OutputExport(name="revisionCreateTime", type=String.class, parameters={})
    private Output<String> revisionCreateTime;

    /**
     * @return The timestamp of when the revision was created. It is also the create time when a new matcher is added.
     * 
     */
    public Output<String> getRevisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * Immutable. The revision ID of the phrase matcher. A new revision is committed whenever the matcher is changed, except when it is activated or deactivated. A server generated random ID will be used. Example: locations/global/phraseMatchers/my-first-matcher@1234567
     * 
     */
    @OutputExport(name="revisionId", type=String.class, parameters={})
    private Output<String> revisionId;

    /**
     * @return Immutable. The revision ID of the phrase matcher. A new revision is committed whenever the matcher is changed, except when it is activated or deactivated. A server generated random ID will be used. Example: locations/global/phraseMatchers/my-first-matcher@1234567
     * 
     */
    public Output<String> getRevisionId() {
        return this.revisionId;
    }
    /**
     * The role whose utterances the phrase matcher should be matched against. If the role is ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
     * 
     */
    @OutputExport(name="roleMatch", type=String.class, parameters={})
    private Output<String> roleMatch;

    /**
     * @return The role whose utterances the phrase matcher should be matched against. If the role is ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
     * 
     */
    public Output<String> getRoleMatch() {
        return this.roleMatch;
    }
    /**
     * The type of this phrase matcher.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of this phrase matcher.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The most recent time at which the phrase matcher was updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The most recent time at which the phrase matcher was updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }
    /**
     * The customized version tag to use for the phrase matcher. If not specified, it will default to `revision_id`.
     * 
     */
    @OutputExport(name="versionTag", type=String.class, parameters={})
    private Output<String> versionTag;

    /**
     * @return The customized version tag to use for the phrase matcher. If not specified, it will default to `revision_id`.
     * 
     */
    public Output<String> getVersionTag() {
        return this.versionTag;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PhraseMatcher(String name, PhraseMatcherArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:contactcenterinsights/v1:PhraseMatcher", name, args == null ? PhraseMatcherArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PhraseMatcher(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:contactcenterinsights/v1:PhraseMatcher", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PhraseMatcher get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PhraseMatcher(name, id, options);
    }
}
