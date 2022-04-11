// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1.MessageArgs;
import io.pulumi.googlenative.healthcare_v1.outputs.ParsedDataResponse;
import io.pulumi.googlenative.healthcare_v1.outputs.PatientIdResponse;
import io.pulumi.googlenative.healthcare_v1.outputs.SchematizedDataResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Pub/Sub topic configured in Hl7V2Store.Hl7V2NotificationConfig, if the filtering matches the message. If an MLLP adapter is configured to listen to a Pub/Sub topic, the adapter transmits the message when a notification is received.
 * 
 */
@ResourceType(type="google-native:healthcare/v1:Message")
public class Message extends io.pulumi.resources.CustomResource {
    /**
     * The datetime when the message was created. Set by the server.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The datetime when the message was created. Set by the server.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Raw message bytes.
     * 
     */
    @Export(name="data", type=String.class, parameters={})
    private Output<String> data;

    /**
     * @return Raw message bytes.
     * 
     */
    public Output<String> getData() {
        return this.data;
    }
    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The message type for this message. MSH-9.1.
     * 
     */
    @Export(name="messageType", type=String.class, parameters={})
    private Output<String> messageType;

    /**
     * @return The message type for this message. MSH-9.1.
     * 
     */
    public Output<String> getMessageType() {
        return this.messageType;
    }
    /**
     * Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parsed version of the raw message data.
     * 
     */
    @Export(name="parsedData", type=ParsedDataResponse.class, parameters={})
    private Output<ParsedDataResponse> parsedData;

    /**
     * @return The parsed version of the raw message data.
     * 
     */
    public Output<ParsedDataResponse> getParsedData() {
        return this.parsedData;
    }
    /**
     * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
     * 
     */
    @Export(name="patientIds", type=List.class, parameters={PatientIdResponse.class})
    private Output<List<PatientIdResponse>> patientIds;

    /**
     * @return All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
     * 
     */
    public Output<List<PatientIdResponse>> getPatientIds() {
        return this.patientIds;
    }
    /**
     * The parsed version of the raw message data schematized according to this store's schemas and type definitions.
     * 
     */
    @Export(name="schematizedData", type=SchematizedDataResponse.class, parameters={})
    private Output<SchematizedDataResponse> schematizedData;

    /**
     * @return The parsed version of the raw message data schematized according to this store's schemas and type definitions.
     * 
     */
    public Output<SchematizedDataResponse> getSchematizedData() {
        return this.schematizedData;
    }
    /**
     * The hospital that this message came from. MSH-4.
     * 
     */
    @Export(name="sendFacility", type=String.class, parameters={})
    private Output<String> sendFacility;

    /**
     * @return The hospital that this message came from. MSH-4.
     * 
     */
    public Output<String> getSendFacility() {
        return this.sendFacility;
    }
    /**
     * The datetime the sending application sent this message. MSH-7.
     * 
     */
    @Export(name="sendTime", type=String.class, parameters={})
    private Output<String> sendTime;

    /**
     * @return The datetime the sending application sent this message. MSH-7.
     * 
     */
    public Output<String> getSendTime() {
        return this.sendTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Message(String name) {
        this(name, MessageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Message(String name, MessageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Message(String name, MessageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:Message", name, args == null ? MessageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Message(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:Message", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Message get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Message(name, id, options);
    }
}
