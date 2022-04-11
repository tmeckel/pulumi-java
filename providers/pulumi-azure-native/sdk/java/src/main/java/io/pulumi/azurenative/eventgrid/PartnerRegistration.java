// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.PartnerRegistrationArgs;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Information about a partner registration.
 * API Version: 2021-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventgrid:PartnerRegistration examplePartnerRegistrationName1 /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/partnerRegistrations/examplePartnerRegistrationName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventgrid:PartnerRegistration")
public class PartnerRegistration extends io.pulumi.resources.CustomResource {
    /**
     * List of Azure subscription Ids that are authorized to create a partner namespace
     * associated with this partner registration. This is an optional property. Creating
     * partner namespaces is always permitted under the same Azure subscription as the one used
     * for creating the partner registration.
     * 
     */
    @Export(name="authorizedAzureSubscriptionIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> authorizedAzureSubscriptionIds;

    /**
     * @return List of Azure subscription Ids that are authorized to create a partner namespace
     * associated with this partner registration. This is an optional property. Creating
     * partner namespaces is always permitted under the same Azure subscription as the one used
     * for creating the partner registration.
     * 
     */
    public Output</* @Nullable */ List<String>> getAuthorizedAzureSubscriptionIds() {
        return this.authorizedAzureSubscriptionIds;
    }
    /**
     * The extension of the customer service URI of the publisher.
     * 
     */
    @Export(name="customerServiceUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerServiceUri;

    /**
     * @return The extension of the customer service URI of the publisher.
     * 
     */
    public Output</* @Nullable */ String> getCustomerServiceUri() {
        return this.customerServiceUri;
    }
    /**
     * Location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the resource.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * URI of the logo.
     * 
     */
    @Export(name="logoUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> logoUri;

    /**
     * @return URI of the logo.
     * 
     */
    public Output</* @Nullable */ String> getLogoUri() {
        return this.logoUri;
    }
    /**
     * Long description for the custom scenarios and integration to be displayed in the portal if needed.
     * Length of this description should not exceed 2048 characters.
     * 
     */
    @Export(name="longDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> longDescription;

    /**
     * @return Long description for the custom scenarios and integration to be displayed in the portal if needed.
     * Length of this description should not exceed 2048 characters.
     * 
     */
    public Output</* @Nullable */ String> getLongDescription() {
        return this.longDescription;
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The extension of the customer service number of the publisher. Only digits are allowed and number of digits should not exceed 10.
     * 
     */
    @Export(name="partnerCustomerServiceExtension", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerCustomerServiceExtension;

    /**
     * @return The extension of the customer service number of the publisher. Only digits are allowed and number of digits should not exceed 10.
     * 
     */
    public Output</* @Nullable */ String> getPartnerCustomerServiceExtension() {
        return this.partnerCustomerServiceExtension;
    }
    /**
     * The customer service number of the publisher. The expected phone format should start with a '+' sign
     * followed by the country code. The remaining digits are then followed. Only digits and spaces are allowed and its
     * length cannot exceed 16 digits including country code. Examples of valid phone numbers are: +1 515 123 4567 and
     * +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515) 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43
     * 
     */
    @Export(name="partnerCustomerServiceNumber", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerCustomerServiceNumber;

    /**
     * @return The customer service number of the publisher. The expected phone format should start with a '+' sign
     * followed by the country code. The remaining digits are then followed. Only digits and spaces are allowed and its
     * length cannot exceed 16 digits including country code. Examples of valid phone numbers are: +1 515 123 4567 and
     * +966 7 5115 2471. Examples of invalid phone numbers are: +1 (515) 123-4567, 1 515 123 4567 and +966 121 5115 24 7 551 1234 43
     * 
     */
    public Output</* @Nullable */ String> getPartnerCustomerServiceNumber() {
        return this.partnerCustomerServiceNumber;
    }
    /**
     * Official name of the partner name. For example: "Contoso".
     * 
     */
    @Export(name="partnerName", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerName;

    /**
     * @return Official name of the partner name. For example: "Contoso".
     * 
     */
    public Output</* @Nullable */ String> getPartnerName() {
        return this.partnerName;
    }
    /**
     * Short description of the partner resource type. The length of this description should not exceed 256 characters.
     * 
     */
    @Export(name="partnerResourceTypeDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerResourceTypeDescription;

    /**
     * @return Short description of the partner resource type. The length of this description should not exceed 256 characters.
     * 
     */
    public Output</* @Nullable */ String> getPartnerResourceTypeDescription() {
        return this.partnerResourceTypeDescription;
    }
    /**
     * Display name of the partner resource type.
     * 
     */
    @Export(name="partnerResourceTypeDisplayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerResourceTypeDisplayName;

    /**
     * @return Display name of the partner resource type.
     * 
     */
    public Output</* @Nullable */ String> getPartnerResourceTypeDisplayName() {
        return this.partnerResourceTypeDisplayName;
    }
    /**
     * Name of the partner resource type.
     * 
     */
    @Export(name="partnerResourceTypeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerResourceTypeName;

    /**
     * @return Name of the partner resource type.
     * 
     */
    public Output</* @Nullable */ String> getPartnerResourceTypeName() {
        return this.partnerResourceTypeName;
    }
    /**
     * Provisioning state of the partner registration.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the partner registration.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     * 
     */
    @Export(name="setupUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> setupUri;

    /**
     * @return URI of the partner website that can be used by Azure customers to setup Event Grid
     * integration on an event source.
     * 
     */
    public Output</* @Nullable */ String> getSetupUri() {
        return this.setupUri;
    }
    /**
     * The system metadata relating to Partner Registration resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to Partner Registration resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Visibility state of the partner registration.
     * 
     */
    @Export(name="visibilityState", type=String.class, parameters={})
    private Output</* @Nullable */ String> visibilityState;

    /**
     * @return Visibility state of the partner registration.
     * 
     */
    public Output</* @Nullable */ String> getVisibilityState() {
        return this.visibilityState;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PartnerRegistration(String name) {
        this(name, PartnerRegistrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PartnerRegistration(String name, PartnerRegistrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PartnerRegistration(String name, PartnerRegistrationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PartnerRegistration", name, args == null ? PartnerRegistrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PartnerRegistration(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PartnerRegistration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventgrid/v20200401preview:PartnerRegistration").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20201015preview:PartnerRegistration").build()),
                Output.of(Alias.builder().type("azure-native:eventgrid/v20210601preview:PartnerRegistration").build())
            ))
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
    public static PartnerRegistration get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PartnerRegistration(name, id, options);
    }
}
