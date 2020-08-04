/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "NGAP-IEs"
 * 	found in "asn/NGAP-IEs.asn"
 * 	`asn1c -fcompound-names -findirect-choice -fno-include-deps -gen-PER -no-gen-OER -no-gen-example -D ngap -pdu=all`
 */

#ifndef	_NGAP_UERadioCapabilityForPagingOfNR_H_
#define	_NGAP_UERadioCapabilityForPagingOfNR_H_


#include <asn_application.h>

/* Including external dependencies */
#include <OCTET_STRING.h>

#ifdef __cplusplus
extern "C" {
#endif

/* NGAP_UERadioCapabilityForPagingOfNR */
typedef OCTET_STRING_t	 NGAP_UERadioCapabilityForPagingOfNR_t;

/* Implementation */
extern asn_TYPE_descriptor_t asn_DEF_NGAP_UERadioCapabilityForPagingOfNR;
asn_struct_free_f NGAP_UERadioCapabilityForPagingOfNR_free;
asn_struct_print_f NGAP_UERadioCapabilityForPagingOfNR_print;
asn_constr_check_f NGAP_UERadioCapabilityForPagingOfNR_constraint;
ber_type_decoder_f NGAP_UERadioCapabilityForPagingOfNR_decode_ber;
der_type_encoder_f NGAP_UERadioCapabilityForPagingOfNR_encode_der;
xer_type_decoder_f NGAP_UERadioCapabilityForPagingOfNR_decode_xer;
xer_type_encoder_f NGAP_UERadioCapabilityForPagingOfNR_encode_xer;
per_type_decoder_f NGAP_UERadioCapabilityForPagingOfNR_decode_uper;
per_type_encoder_f NGAP_UERadioCapabilityForPagingOfNR_encode_uper;
per_type_decoder_f NGAP_UERadioCapabilityForPagingOfNR_decode_aper;
per_type_encoder_f NGAP_UERadioCapabilityForPagingOfNR_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _NGAP_UERadioCapabilityForPagingOfNR_H_ */
#include <asn_internal.h>